package com.tdtk.action;

import com.tdtk.dao.UsrDAO;
import com.tdtk.model.UsrVo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class LoginAction {
    
    @RequestMapping("/")
    public String toLogin() {
        return "login";
    }
    
    //跳转页面并返回参数：非ajax模式（不是回掉函数的返回值），直接返回
    @RequestMapping("/login")
    public String login(String name , String pwd, Model model) {
        UsrDAO usrDao =new UsrDAO();
        if(!"".equals(name)){
//            System.out.println(name+pwd);
            // TODO  查询数据库
            UsrVo usrVo = usrDao.query(name);
            System.out.println(usrVo);
            if(!pwd.equals(usrVo.getMng_psw())){
                return "/";
            }
            model.addAttribute("usrVo", usrVo);
        }
        
        return "index";
    }
    
    //跳转页面并返回参数：ajax模式（是回掉函数的返回值）
    @RequestMapping("/queryAll")
    @ResponseBody
    public List<Map<String, String>>  queryAll(String mngId,Model model) {
        System.out.println("入参mngId：" + mngId);
        List<Map<String, String>> list = new ArrayList<>();
        for (int i = 0; i < 10 ; i++) {
            Map<String, String> map = new HashMap<String, String>();
            map.put("name","小明"+"：" + i);
            map.put("project","快乐美食"+"："+ i);
            map.put("signTime","2014/10/2 8:50:00"+"："+ i);
            map.put("isSign","是"+"："+ i);
            map.put("signSum","2"+"："+ i);
            map.put("upWorkTime",""+"："+ i);
            list.add(map);
        }
        model.addAttribute("list",list);
        
        return list;
    }
}