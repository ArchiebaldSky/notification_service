package faang.school.notificationservice.messaging.message_builder;

import java.util.Locale;

public interface MessageBuilder<T> {

    String buildMessage(T event, Locale locale);
    boolean supportsEventType(T event);
}