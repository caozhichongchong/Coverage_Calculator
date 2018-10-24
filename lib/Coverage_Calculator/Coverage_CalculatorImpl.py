# -*- coding: utf-8 -*-
#BEGIN_HEADER
#END_HEADER


class Coverage_Calculator:
    '''
    Module Name:
    Coverage_Calculator

    Module Description:
    A KBase module: Coverage_Calculator
    '''

    ######## WARNING FOR GEVENT USERS ####### noqa
    # Since asynchronous IO can lead to methods - even the same method -
    # interrupting each other, you must be *very* careful when using global
    # state. A method could easily clobber the state set by another while
    # the latter method is running.
    ######################################### noqa
    VERSION = "0.0.1"
    GIT_URL = "https://github.com/caozhichongchong/Coverage_Calculator.git"
    GIT_COMMIT_HASH = "d5368fe19ad834aed1a9ac02d1fc7a3691778856"

    #BEGIN_CLASS_HEADER
    #END_CLASS_HEADER

    # config contains contents of config file in a hash or None if it couldn't
    # be found
    def __init__(self, config):
        #BEGIN_CONSTRUCTOR
        #END_CONSTRUCTOR
        pass


    def run_Coverage_Calculator(self, ctx, params):
        """
        :param params: instance of type "CC_InParams" -> structure: parameter
           "assembly_addr" of type "obj_addr", parameter "read_lib_addr" of
           type "obj_addr", parameter "length_cutoff" of Long, parameter
           "dist_depth_coverage_cutoff" of Double, parameter
           "abs_depth_coverage_cutoff" of Double, parameter
           "assembly_output_name" of type "obj_name" (Insert your typespec
           information here.)
        :returns: instance of type "CC_OutParams" -> structure: parameter
           "report_name" of type "obj_name" (Insert your typespec information
           here.), parameter "report_addr" of type "obj_addr"
        """
        # ctx is the context object
        # return variables are: returnVal
        #BEGIN run_Coverage_Calculator
        #END run_Coverage_Calculator

        # At some point might do deeper type checking...
        if not isinstance(returnVal, dict):
            raise ValueError('Method run_Coverage_Calculator return value ' +
                             'returnVal is not type dict as required.')
        # return the results
        return [returnVal]
    def status(self, ctx):
        #BEGIN_STATUS
        returnVal = {'state': "OK",
                     'message': "",
                     'version': self.VERSION,
                     'git_url': self.GIT_URL,
                     'git_commit_hash': self.GIT_COMMIT_HASH}
        #END_STATUS
        return [returnVal]
