package com.xuecheng.manage_cms.web.controller;

import com.xuecheng.api.cms.CmsPageControllerApi;
import com.xuecheng.framework.domain.cms.CmsPage;
import com.xuecheng.framework.domain.request.QueryPageRequest;
import com.xuecheng.framework.model.response.CommonCode;
import com.xuecheng.framework.model.response.QueryResponseResult;
import com.xuecheng.framework.model.response.QueryResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CmsPageController implements CmsPageControllerApi {


    @Override
    @GetMapping("/list")
    public QueryResponseResult findList(int page, int size, QueryPageRequest queryPageRequest) {
        //暂时采用测试数据，测试接口是否可以正常运行。
        QueryResult<CmsPage> queryResult = new QueryResult<>();
        CmsPage cmsPage = new CmsPage();
        cmsPage.setPageName("测试页面");
        ArrayList<CmsPage> list = new ArrayList<>();
        list.add(cmsPage);
        queryResult.setList(list);
        queryResult.setTotal(2);
        //返回对象
        QueryResponseResult queryResponseResult = new QueryResponseResult(CommonCode.SUCCESS, queryResult);
        return queryResponseResult;
    }
}
