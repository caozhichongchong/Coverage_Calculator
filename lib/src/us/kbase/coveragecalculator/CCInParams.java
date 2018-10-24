
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
 * <p>Original spec-file type: CC_InParams</p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "assembly_addr",
    "read_lib_addr",
    "length_cutoff",
    "dist_depth_coverage_cutoff",
    "abs_depth_coverage_cutoff",
    "assembly_output_name"
})
public class CCInParams {

    @JsonProperty("assembly_addr")
    private String assemblyAddr;
    @JsonProperty("read_lib_addr")
    private String readLibAddr;
    @JsonProperty("length_cutoff")
    private Long lengthCutoff;
    @JsonProperty("dist_depth_coverage_cutoff")
    private Double distDepthCoverageCutoff;
    @JsonProperty("abs_depth_coverage_cutoff")
    private Double absDepthCoverageCutoff;
    @JsonProperty("assembly_output_name")
    private String assemblyOutputName;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("assembly_addr")
    public String getAssemblyAddr() {
        return assemblyAddr;
    }

    @JsonProperty("assembly_addr")
    public void setAssemblyAddr(String assemblyAddr) {
        this.assemblyAddr = assemblyAddr;
    }

    public CCInParams withAssemblyAddr(String assemblyAddr) {
        this.assemblyAddr = assemblyAddr;
        return this;
    }

    @JsonProperty("read_lib_addr")
    public String getReadLibAddr() {
        return readLibAddr;
    }

    @JsonProperty("read_lib_addr")
    public void setReadLibAddr(String readLibAddr) {
        this.readLibAddr = readLibAddr;
    }

    public CCInParams withReadLibAddr(String readLibAddr) {
        this.readLibAddr = readLibAddr;
        return this;
    }

    @JsonProperty("length_cutoff")
    public Long getLengthCutoff() {
        return lengthCutoff;
    }

    @JsonProperty("length_cutoff")
    public void setLengthCutoff(Long lengthCutoff) {
        this.lengthCutoff = lengthCutoff;
    }

    public CCInParams withLengthCutoff(Long lengthCutoff) {
        this.lengthCutoff = lengthCutoff;
        return this;
    }

    @JsonProperty("dist_depth_coverage_cutoff")
    public Double getDistDepthCoverageCutoff() {
        return distDepthCoverageCutoff;
    }

    @JsonProperty("dist_depth_coverage_cutoff")
    public void setDistDepthCoverageCutoff(Double distDepthCoverageCutoff) {
        this.distDepthCoverageCutoff = distDepthCoverageCutoff;
    }

    public CCInParams withDistDepthCoverageCutoff(Double distDepthCoverageCutoff) {
        this.distDepthCoverageCutoff = distDepthCoverageCutoff;
        return this;
    }

    @JsonProperty("abs_depth_coverage_cutoff")
    public Double getAbsDepthCoverageCutoff() {
        return absDepthCoverageCutoff;
    }

    @JsonProperty("abs_depth_coverage_cutoff")
    public void setAbsDepthCoverageCutoff(Double absDepthCoverageCutoff) {
        this.absDepthCoverageCutoff = absDepthCoverageCutoff;
    }

    public CCInParams withAbsDepthCoverageCutoff(Double absDepthCoverageCutoff) {
        this.absDepthCoverageCutoff = absDepthCoverageCutoff;
        return this;
    }

    @JsonProperty("assembly_output_name")
    public String getAssemblyOutputName() {
        return assemblyOutputName;
    }

    @JsonProperty("assembly_output_name")
    public void setAssemblyOutputName(String assemblyOutputName) {
        this.assemblyOutputName = assemblyOutputName;
    }

    public CCInParams withAssemblyOutputName(String assemblyOutputName) {
        this.assemblyOutputName = assemblyOutputName;
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
        return ((((((((((((((("CCInParams"+" [assemblyAddr=")+ assemblyAddr)+", readLibAddr=")+ readLibAddr)+", lengthCutoff=")+ lengthCutoff)+", distDepthCoverageCutoff=")+ distDepthCoverageCutoff)+", absDepthCoverageCutoff=")+ absDepthCoverageCutoff)+", assemblyOutputName=")+ assemblyOutputName)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
