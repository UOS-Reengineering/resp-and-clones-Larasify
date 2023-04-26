package example.project.GodClassExample;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import java.util.*;


public class Payroll {

    Map<String, PaySchedule> staffCategoryPaySchedule;

    public Payroll(Map<String, PaySchedule> staffCategoryPaySchedule) {
        this.staffCategoryPaySchedule = staffCategoryPaySchedule;
    }

    public PaySchedule getStaffCategoryPaySchedule(String staffCategory) {
        return staffCategoryPaySchedule.get(staffCategory);
    }

    public void changeDate(String staffCategory, String d){
        PaySchedule ps = staffCategoryPaySchedule.get(staffCategory);
        ps.setDate(d);
    }
    public String getDate(String staffCategory){
        PaySchedule ps = staffCategoryPaySchedule.get(staffCategory);
        return ps.getPayDay();
    }


}
