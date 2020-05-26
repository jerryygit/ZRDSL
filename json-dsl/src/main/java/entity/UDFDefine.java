package entity;

/**
 * FileName:    UDFDefine
 * Author:      JERRY
 * Date:        2020/5/13 17:22
 * Description: 动态UDF实体
 */
public class UDFDefine {
    private String className;
    private String code;
    private String type;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
