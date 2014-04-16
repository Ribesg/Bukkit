package org.bukkit.chat;

import java.util.regex.Pattern;

// TODO Find a better name for this
public class OpenUrlHook extends ClickHook {

    private static final Pattern HTTP_REGEX = Pattern.compile("^https?://", Pattern.CASE_INSENSITIVE);

    private final String url;

    public OpenUrlHook(String url) {
        super(Type.OPEN_URL);
        if (!HTTP_REGEX.matcher(url).matches()) {
            throw new IllegalArgumentException("Valid http/https URL required");
        }
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
