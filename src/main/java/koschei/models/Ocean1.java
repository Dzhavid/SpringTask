package koschei.models;

import koschei.KoscheiTheDeathless;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Ocean1 {

    @Autowired
    private Island2 island;

    @Autowired
    private KoscheiTheDeathless koscheiTheDeathless;

    @Override
    public String toString() {
        return "на океане остров " + island.toString();
    }
}
