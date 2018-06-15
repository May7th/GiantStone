package com.oyun.giantstone.Service.Impl;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.oyun.giantstone.Service.TreeService;
import com.oyun.giantstone.dao.DepartmentMapper;
import com.oyun.giantstone.dto.DeptLevelDto;
import com.oyun.giantstone.model.Department;
import com.oyun.giantstone.util.LevelUtil;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @program: giantstone
 * @description:
 * @author: changzhen
 * @create: 2018-06-15 10:36
 **/

@Service
public class TreeServiceImpl implements TreeService {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public List<DeptLevelDto> departmentTree(){

        List<Department> departments = departmentMapper.getAllDepartment();

        List<DeptLevelDto> deptLevelDtoList = Lists.newArrayList();

        for (Department department :
                departments) {
            deptLevelDtoList.add(DeptLevelDto.adapt(department));
        }

        return departmentListToTree(deptLevelDtoList);

    }

    public List<DeptLevelDto> departmentListToTree(List<DeptLevelDto> deptLevelList ){

        if (CollectionUtils.isEmpty(deptLevelList)){
            return Lists.newArrayList();
        }

        Multimap<String,DeptLevelDto> levelDtoMultimap = ArrayListMultimap.create();
        List<DeptLevelDto> rootList = Lists.newArrayList();

        for (DeptLevelDto dto :
                deptLevelList) {
            if (LevelUtil.ROOT.equals(dto.getLevel())){
                rootList.add(dto);
            }
        }

        Collections.sort(rootList, (DeptLevelDto o1, DeptLevelDto o2) -> (o1.getSeq() - o2.getSeq()));

        transformDeptTree(rootList,LevelUtil.ROOT,levelDtoMultimap);
        return rootList;
    }

    public void transformDeptTree(List<DeptLevelDto> deptLevelDtoList,String level,Multimap<String,DeptLevelDto> levelDtoMultimap){
        for (int i = 0; i < deptLevelDtoList.size(); i++) {
            DeptLevelDto deptLevelDto = deptLevelDtoList.get(i);

            String nextLevel = LevelUtil.calculateLevel(level,deptLevelDto.getId());

            List<DeptLevelDto> tempDeptList = (List<DeptLevelDto>) levelDtoMultimap.get(nextLevel);

            if (CollectionUtils.isNotEmpty(tempDeptList)){
                Collections.sort(tempDeptList,((o1, o2) -> (o1.getSeq()-o2.getSeq())));

                deptLevelDto.setDeptLevelList(tempDeptList);

                transformDeptTree(tempDeptList,nextLevel,levelDtoMultimap);
            }

        }
    }

















}
