package com.mihainataliaqa.gitworkflow;

///import java.util.Arrays;

public class GitWorkFlow {
    public static void main(String[] args) {
        String step1 = "1) Open IntelliJ IDEA and navigate to the master branch - git checkout master";
        String step2 = "2) Open the terminal and execute the - git fetch - command to make sure there are some change on cloud, but not download them";
        String step3 = "3) Execute the command - git pull - that will download the changes from origin/master to local master branch";
        String step3sp = "";

        String step4A = "4A) Create a new package name_task-1 ";
        String step4 = "4) Create a new branch and move to it - git checkout -b NAME_Task-1 - it will redirect us to the Task-1 branch";

        String step4_1 = "   OR ";
        String step4_2 = "4_1) Create a new branch  - git branch NAME_Task-1 - it will created the Task-1 branch";
        String step4_3 = "4_2) Move to branch  - git checkout NAME_Task-1 - it will redirect us to the Task-1 branch";
        String step4sp = "";
        // As result, there are 2 branch on the local memory : master & Task-1 , and on the Cloud memory we have only 1 branch : origin/master

        String step5 = "5) Add the changes related to the Task-1 , being on the Task-1  branch";
        String step6 = "6) Add the changes into the history of the local branch Task-1 , using the command - git commit ";
        String step7 = "7) Execute the command - git push - as result there is created the new branch on GITHUB called origin/Task-1 ";

        // As result, there are 2 branch on the local memory and 2 branch on the Cloud memory : origin/master & origin/Task-1

        String step8 = "8) Create a pull request from source origin/Task-1 to origin/master - make sure you add the reviewers";
        String step9 = "9) If there are NO comments and the code is approved (changes), then we merge the code";
        String step9sp = "";


        String step9_1 = "9_1) If there are some comments, then we go to back to local branch Task-1 -> in IntelliJ IDEA ";
        String step9_2 = "9_2) We add the changes and modify the last commit , by using the command - git commit amend";
        String step9_3 = "9_3) Then we gave to execute the  - git push -f  - command, (incarcarea fortata a modificarilor pe Cloud)";
        String step9sp1 = "";

        // As result, the origin/master will have the latest code that was previously added in the origin/Task-1

        String step10 = "10) Go back to IntelliJ IDEA  where we are on Task-1 branch, and move to the master - git checkout master";
        String step11 = "11) Execute the commands: - git fetch and - git pull to download the latest changes that were added to origin/master";

        System.out.println(step1);
        System.out.println(step2);
        System.out.println(step3);
        System.out.println(step3sp);
        //
        System.out.println(step4A);
        System.out.println(step4);
        System.out.println(step4_1);
        System.out.println(step4_2);
        System.out.println(step4_3);
        System.out.println(step4sp);
        //
        System.out.println(step5);
        System.out.println(step6);
        System.out.println(step7);
        System.out.println(step8);
        System.out.println(step9);
        System.out.println(step9sp);
        //
        System.out.println(step9_1);
        System.out.println(step9_2);
        System.out.println(step9_3);
        System.out.println(step9sp1);
        //
        System.out.println(step10);
        System.out.println(step11);




    }
}
