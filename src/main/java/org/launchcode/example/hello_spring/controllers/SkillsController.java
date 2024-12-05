package org.launchcode.example.hello_spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    @GetMapping("")
    @ResponseBody
    public String index() {
        String html = "<H1>Skills Tracker</H1>" +
                "<H2>Here's your list!</H2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>CSS</li>" +
                "<li>Python</li>" +
                "</ol>";
        return html;
    }

    @GetMapping("form")
    @ResponseBody
    public String skillForm() {
        String html = "<form method='post'>" +
                "<H3>Please enter your name: </H3>" +
                "<input type ='text' name='name' />" +
                "<H3>First choice: </H3>" +
                "<select name='lang1'>" +
                "<option value='Java'>Java</option>" +
                "<option value='CSS'>CSS</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<H3>Second choice: </H3>" +
                "<select name='lang2'>" +
                "<option value='Java'>Java</option>" +
                "<option value='CSS'>CSS</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<H3>Third choice: </H3>" +
                "<select name='lang3'>" +
                "<option value='Java'>Java</option>" +
                "<option value='CSS'>CSS</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<br>" +
                "<br>" +
                "<button type='submit'>Submit</button>" +
                "</form>";
        return html;
    }

    //    @PostMapping("form")
//    @ResponseBody
//    public String handleSkillForm(@RequestParam String name,@RequestParam String lang1,@RequestParam String lang2,@RequestParam String lang3){
//        String response = "<H1>Here is " + name + "'s favorite programming languages!</H1>" +
//                "<H2>Here's your ranking!</H2>" +
//                "<ol>" +
//                "<li>"+ lang1 + "</li>" +
//                "<li>"+ lang2 + "</li>" +
//                "<li>"+ lang3 + "</li>" +
//                "</ol>";
//
//        return response;
//    }
    @PostMapping("form")
    @ResponseBody
    public String tableForm(@RequestParam String name, @RequestParam String lang1, @RequestParam String lang2, @RequestParam String lang3){
        String html =
                "<H1>Here is " + name + "'s favorite programming languages!</H1>" +
                        "<table>" +
                        "<tr>" +
                        "<th>First choice</th>" +
                        "<th>Second choice</th>" +
                        "<th>Third choice</th>" +
                        "</tr>" +
                        "<tr>" +
                        "<td>"+ lang1 + "</td>" +
                        "<td>"+ lang2 + "</td>" +
                        "<td>"+ lang3 + "</td>" +
                        "</tr>" +
                        "</table>";

        return html;
    };

}