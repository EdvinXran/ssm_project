package com.ssm.mapper.qualityControl;

import com.ssm.bean.qualityControl.ProcessMeasureCheck;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProcessMeasureCheckMapper {

    List<ProcessMeasureCheck> findByPage(@Param("rows") int rows, @Param("offset") int offset);

    int findAllCount();

    int updateNote(@Param("id") String id,@Param("note") String note);

    int deleteByIds(@Param("ids") String[] ids);


}