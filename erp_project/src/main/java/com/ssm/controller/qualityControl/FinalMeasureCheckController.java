package com.ssm.controller.qualityControl;

import com.ssm.bean.ResponseMessage;
import com.ssm.bean.ResponseVO;
import com.ssm.bean.qualityControl.FinalMeasuretCheck;
import com.ssm.service.qualityControl.FinalMeasureCheckService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/measure")
public class FinalMeasureCheckController {

    @Autowired
    FinalMeasureCheckService finalMeasureCheckService;
    Logger logger = Logger.getLogger(this.getClass());

    /**
     * 成品计量质检的刷新及list页面
     * @return
     */
    @RequestMapping("list")
    @ResponseBody
    public ResponseVO<FinalMeasuretCheck> list(Integer page, Integer rows){
        //todo
        int offset = (page - 1) * rows;

        List finalMeasureCheck = finalMeasureCheckService.findByPage(rows,offset);
        int allCount = finalMeasureCheckService.findAllCount();
        ResponseVO<FinalMeasuretCheck> vo = new ResponseVO<>();
        vo.setRows(finalMeasureCheck);
        vo.setTotal(allCount);
        return vo;
    }

    /**
     * 来自home.jsp的list
     * @return
     */
    @RequestMapping("find")
    public String find(){
        return "measurement_list";
    }

    @RequestMapping("update_note")
    @ResponseBody
    public ResponseMessage update_note(String fMeasureCheckId, String note){
        int i = finalMeasureCheckService.updateNote(fMeasureCheckId, note);
        return ResponseMessage.getMessage(i);
    }

    @RequestMapping("delete_batch")
    @ResponseBody
    public ResponseMessage delete_batch(String[] ids){
        int i = finalMeasureCheckService.deleteByIds(ids);
        return ResponseMessage.getMessage(i);
    }









}
