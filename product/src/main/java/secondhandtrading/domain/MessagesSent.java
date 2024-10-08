package secondhandtrading.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import secondhandtrading.domain.*;
import secondhandtrading.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class MessagesSent extends AbstractEvent {

    private Long chatId;
    private Long postId;
    private String userId;
    private String sellerUserId;

    public MessagesSent(Product aggregate) {
        super(aggregate);
    }

    public MessagesSent() {
        super();
    }
}
//>>> DDD / Domain Event
