package com.jvm_bloggers.core.social.fb;

import org.springframework.stereotype.Component;

import static java.lang.String.format;

@Component
class FacebookMessageGenerator {

    private static final String MESSAGE_TEMPLATE =
        "Nowe wydanie JVM Bloggers czeka już na Was: %s #java #jvm #newsletter #jvmbloggers #blogs";

    public String generateFacebookMessage(String issueLink) {
        return format(MESSAGE_TEMPLATE, issueLink);
    }

}
