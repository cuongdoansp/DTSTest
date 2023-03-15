package com.example.dtstest.controller;

import com.example.dtstest.util.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
@SessionAttributes("todo")
public class MainController {

    List<String> stringList = new ArrayList<>();

    @GetMapping("/")
    public String homePage(){
        return "homePage";
    }


    @RequestMapping(value = {"/sorting1"})
    public String sorting1(Model model) throws Exception{
        List<String> list =  BubbleSort.bubbleSort(stringList);
        model.addAttribute("arrList", list);
        return "arrList";
    }

    @RequestMapping(value = {"/sorting3"})
    public String sorting3(Model model) throws Exception{

        List<String> list = SelectionSort.selectionSort(stringList);
        model.addAttribute("arrList", list);
        return "arrList";
    }

    @RequestMapping(value = {"/sorting2"})
    public String sorting2(Model model) throws Exception{

        List<String> list = InsertionSort.insertionSort(stringList);
        model.addAttribute("arrList", list);
        return "arrList";
    }


    @RequestMapping(value = {"/sorting4"})
    public String sorting4(Model model) throws Exception{
        QuickSort quickSort = new QuickSort();
        quickSort.sort((String[]) stringList.stream().toArray(String[]::new));
        model.addAttribute("arrList",  (List) Arrays.asList(quickSort.getStrings()));
        return "arrList";
    }

    @RequestMapping(value = {"/sorting5"})
    public String sorting5(Model model) throws Exception{

        String[] strings = (String[]) stringList.stream().toArray(String[]::new);
        MergeSort.mergeSort(strings, 0 , strings.length - 1);
        List<String> stringList = Arrays.asList(strings);
        model.addAttribute("arrList", stringList);
        return "arrList";
    }

    @RequestMapping(value = {"/addListRandom"})
    public String iteration(Model model){


        for (int i = 0; i < 1000; i++) {
            stringList.add(AddArr.randomString(AddArr.randomLength()));
        }

        model.addAttribute("arrList", stringList);
        return "arrList";
    }


}
