
package guru.springframwrork.api.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Example implements Serializable
{

    private List<User> data = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -6845739836166675588L;

    public List<User> getData() {
        return data;
    }

    public void setData(List<User> data) {
        this.data = data;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
