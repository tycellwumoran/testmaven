package com.example.wmrmaven.objecttemp;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wumoran
 * @version 1.0
 * @description 自定义分页
 * @date 2021/11/9 15:39
 */
public class PageUtil {


    public  static <T> List<T> getPageList(int currentPage, int pageSize, List<T> list){

        int total = list.size();
        if (total > pageSize) {
            int toIndex = pageSize * currentPage;
            if (toIndex > total) {
                toIndex = total;
            }
            int totalPage = total % pageSize == 0 ? (total/pageSize) : (total/pageSize)+1;
            if (totalPage < currentPage){
                list = new ArrayList<>();
            }else {
                list = list.subList(pageSize * (currentPage - 1), toIndex);
            }
        }
        return list;
    }





}