
package us.kbase.coveragecalculator;

import java.util.HashMap;
import java.util.List;
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
    "input_assembly_refs",
    "input_readsLib_refs",
    "length_cutoff",
    "dist_depth_coverage_cutoff",
    "abs_depth_coverage_cutoff",
    "output_assembly_name"
})
public class CCInParams {

    @JsonProperty("input_assembly_refs")
    private List<String> inputAssemblyRefs;
    @JsonProperty("input_readsLib_refs")
    private List<String> inputReadsLibRefs;
    @JsonProperty("length_cutoff")
    private Long lengthCutoff;
    @JsonProperty("dist_depth_coverage_cutoff")
    private Double distDepthCoverageCutoff;
    @JsonProperty("abs_depth_coverage_cutoff")
    private Double absDepthCoverageCutoff;
    @JsonProperty("output_assembly_name")
    private java.lang.String outputAssemblyName;
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    @JsonProperty("input_assembly_refs")
    public List<String> getInputAssemblyRefs() {
        return inputAssemblyRefs;
    }

    @JsonProperty("input_assembly_refs")
    public void setInputAssemblyRefs(List<String> inputAssemblyRefs) {
        this.inputAssemblyRefs = inputAssemblyRefs;
    }

    public CCInParams withInputAssemblyRefs(List<String> inputAssemblyRefs) {
        this.inputAssemblyRefs = inputAssemblyRefs;
        return this;
    }

    @JsonProperty("input_readsLib_refs")
    public List<String> getInputReadsLibRefs() {
        return inputReadsLibRefs;
    }

    @JsonProperty("input_readsLib_refs")
    public void setInputReadsLibRefs(List<String> inputReadsLibRefs) {
        this.inputReadsLibRefs = inputReadsLibRefs;
    }

    public CCInParams withInputReadsLibRefs(List<String> inputReadsLibRefs) {
        this.inputReadsLibRefs = inputReadsLibRefs;
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

    @JsonProperty("output_assembly_name")
    public java.lang.String getOutputAssemblyName() {
        return outputAssemblyName;
    }

    @JsonProperty("output_assembly_name")
    public void setOutputAssemblyName(java.lang.String outputAssemblyName) {
        this.outputAssemblyName = outputAssemblyName;
    }

    public CCInParams withOutputAssemblyName(java.lang.String outputAssemblyName) {
        this.outputAssemblyName = outputAssemblyName;
        return this;
    }

    @JsonAnyGetter
    public Map<java.lang.String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(java.lang.String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public java.lang.String toString() {
        return ((((((((((((((("CCInParams"+" [inputAssemblyRefs=")+ inputAssemblyRefs)+", inputReadsLibRefs=")+ inputReadsLibRefs)+", lengthCutoff=")+ lengthCutoff)+", distDepthCoverageCutoff=")+ distDepthCoverageCutoff)+", absDepthCoverageCutoff=")+ absDepthCoverageCutoff)+", outputAssemblyName=")+ outputAssemblyName)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
