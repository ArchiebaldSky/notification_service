package faang.school.notificationservice.service.message;

import java.util.Locale;

public interface MessageBuilder<T> {

    String buildMessage(T event, Locale locale);

    boolean supports(Class<?> clazz);
}
