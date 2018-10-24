/*
A KBase module: Coverage_Calculator
*/

module Coverage_Calculator {
    /*
        Insert your typespec information here.
    */

    typedef string obj_name;
    typedef string obj_addr;

    typedef structure {
        obj_addr assembly_addr;
        obj_addr read_lib_addr;
        int length_cutoff;
        float dist_depth_coverage_cutoff;
        float abs_depth_coverage_cutoff;
        obj_name assembly_output_name;
    } CC_InParams;

    typedef structure {
        obj_name report_name;
        obj_addr report_addr;
    } CC_OutParams;
    
    funcdef run_Coverage_Calculator(CC_InParams params)
        returns (CC_OutParams) authentication required;
};
