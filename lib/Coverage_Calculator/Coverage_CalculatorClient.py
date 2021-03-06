# -*- coding: utf-8 -*-
############################################################
#
# Autogenerated by the KBase type compiler -
# any changes made here will be overwritten
#
############################################################

from __future__ import print_function
# the following is a hack to get the baseclient to import whether we're in a
# package or not. This makes pep8 unhappy hence the annotations.
try:
    # baseclient and this client are in a package
    from .baseclient import BaseClient as _BaseClient  # @UnusedImport
except:
    # no they aren't
    from baseclient import BaseClient as _BaseClient  # @Reimport


class Coverage_Calculator(object):

    def __init__(
            self, url=None, timeout=30 * 60, user_id=None,
            password=None, token=None, ignore_authrc=False,
            trust_all_ssl_certificates=False,
            auth_svc='https://kbase.us/services/authorization/Sessions/Login'):
        if url is None:
            raise ValueError('A url is required')
        self._service_ver = None
        self._client = _BaseClient(
            url, timeout=timeout, user_id=user_id, password=password,
            token=token, ignore_authrc=ignore_authrc,
            trust_all_ssl_certificates=trust_all_ssl_certificates,
            auth_svc=auth_svc)

    def run_Coverage_Calculator(self, params, context=None):
        """
        :param params: instance of type "CC_InParams" -> structure: parameter
           "input_assembly_refs" of list of type "obj_addr", parameter
           "input_readsLib_refs" of list of type "obj_addr", parameter
           "length_cutoff" of Long, parameter "dist_depth_coverage_cutoff" of
           Double, parameter "abs_depth_coverage_cutoff" of Double, parameter
           "output_assembly_name" of type "obj_name" (Insert your typespec
           information here.)
        :returns: instance of type "CC_OutParams" -> structure: parameter
           "report_name" of type "obj_name" (Insert your typespec information
           here.), parameter "report_addr" of type "obj_addr"
        """
        return self._client.call_method(
            'Coverage_Calculator.run_Coverage_Calculator',
            [params], self._service_ver, context)

    def status(self, context=None):
        return self._client.call_method('Coverage_Calculator.status',
                                        [], self._service_ver, context)
