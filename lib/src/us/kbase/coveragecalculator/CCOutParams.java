
package us.kbase.coveragecalculator;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * <p>Original spec-file type: CC_OutParams</p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "report_name",
    "report_addr"
})
public class CCOutParams {

    @JsonProperty("report_name")
    private String reportName;
    @JsonProperty("report_addr")
    private String reportAddr;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("report_name")
    public String getReportName() {
        return reportName;
    }

    @JsonProperty("report_name")
    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public CCOutParams withReportName(String reportName) {
        this.reportName = reportName;
        return this;
    }

    @JsonProperty("report_addr")
    public String getReportAddr() {
        return reportAddr;
    }

    @JsonProperty("report_addr")
    public void setReportAddr(String reportAddr) {
        this.reportAddr = reportAddr;
    }

    public CCOutParams withReportAddr(String reportAddr) {
        this.reportAddr = reportAddr;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return ((((((("CCOutParams"+" [reportName=")+ reportName)+", reportAddr=")+ reportAddr)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
