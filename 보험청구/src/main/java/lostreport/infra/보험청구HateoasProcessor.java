package lostreport.infra;

import lostreport.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class 보험청구HateoasProcessor
    implements RepresentationModelProcessor<EntityModel<보험청구>> {

    @Override
    public EntityModel<보험청구> process(EntityModel<보험청구> model) {
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/결과수신")
                .withRel("결과수신")
        );

        return model;
    }
}
