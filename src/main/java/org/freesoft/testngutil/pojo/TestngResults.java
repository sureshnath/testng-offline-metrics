package org.freesoft.testngutil.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;
import lombok.Data;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Data
@JacksonXmlRootElement(localName = "testng-results")
public class TestngResults {
    @JsonProperty("reporter-output")
    private String reporterOutput;
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Suite> suite;
    private Integer ignored;
    private Integer total;
    private Integer passed;
    private Integer failed;
    private Integer skipped;
    public static <T> List<T> getEmptyListIfNull(List<T> list){
        return Optional.ofNullable(list).orElse(Collections.emptyList());
    }
    @Data
    public static class Suite{
        @JacksonXmlElementWrapper(useWrapping = false)
        private List<TestDetail> test;
        @JsonIgnore
        private Groups groups;
        @JsonProperty("started-at")
        private String startedAt;
        private String name;
        @JsonProperty("finished-at")
        private String finishedAt;
        @JsonProperty("duration-ms")
        private String durationMillis;
        public List<TestDetail> getTest(){
            return getEmptyListIfNull(test);
        }
    }
    @Data
    public static class Groups{
        @JacksonXmlElementWrapper(useWrapping = false)
        @JsonSetter(nulls= Nulls.AS_EMPTY) // null will clear to empty list
        private List<Group> group= Collections.emptyList();
    }
    @Data
    public static class Group{
        private String name;
        @JacksonXmlElementWrapper(useWrapping = false)
        private List<MethodDetail> method;
    }
    @Data
    public static class MethodDetail{
        private String signature;
        private String name;
        @JsonProperty("class")
        private String clazz;
        private String content;
    }
    @Data
    public static class TestDetail{
        @JsonProperty("started-at")
        private String startedAt;
        private String name;
        @JsonProperty("finished-at")
        private String finishedAt;
        @JsonProperty("duration-ms")
        private String durationMillis;
        @JsonProperty("class")
        @JacksonXmlElementWrapper(useWrapping = false)
        private List<ClassDetail> classDetailList;

        public List<ClassDetail> getClassDetailList() {
            return getEmptyListIfNull(classDetailList);
        }
    }
    @Data
    public static class ClassDetail{
        @JsonProperty("test-method")
        @JacksonXmlElementWrapper(useWrapping = false)
        private List<TestMethod> testMethodList;
        private String name;
    }
    @Data
    public static class TestMethod {
        private ExceptionInfo exception;
        @JsonProperty("reporter-output")
        private String reporterOutput;
        @JsonProperty("is-config")
        private String isConfig;
        private String signature;
        @JsonProperty("started-at")
        private String startedAt;
        private String name;
        private Params params;
        @JsonProperty("finished-at")
        private String finishedAt;
        @JsonProperty("depends-on-methods")
        private String dependsOnMethods;
        @JsonProperty("duration-ms")
        private Long durationMillis;
        private String status;
        @JsonProperty("data-provider")
        private String dataProvider;
        private String description;

        public Long getDurationMillis() {
            return durationMillis>0?durationMillis:0;
        }
    }

    @Data
    public static class Params {
        private Param param;
    }

    @Data
    public static class Param {
        private String index;
        private Value value;
    }

    @Data
    public static class Value {
        @JacksonXmlProperty(isAttribute = true, localName = "is-null")
        private String isNull;
        @JacksonXmlText
        private String value;
    }

    @Data
    public static class ExceptionInfo {
        @JsonProperty("full-stacktrace")
        private String fullStacktrace;
        private String message;
        @JsonProperty("class")
        private String className;
    }
}
