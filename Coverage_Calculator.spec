/*
A KBase module: Coverage_Calculator
*/

module Coverage_Calculator {
    /*
        Insert your typespec information here.
    */
    typedef structure {
        string alignment;
    } InParams;
    typedef structure {
        string output;
    } OutParams;
    funcdef run_Coverage_Calculator(InParams params)
        returns (OutParams) authentication required;
};
