package lostreport.infra;

import lostreport.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class TeleServiceHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<TeleService>> {

    @Override
    public EntityModel<TeleService> process(EntityModel<TeleService> model) {
        return model;
    }
}
