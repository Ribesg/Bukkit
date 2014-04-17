package org.bukkit.chat;

import java.util.regex.Pattern;

// TODO Javadoc
public class OpenUrlAction extends ClickAction {

    private static final Pattern HTTP_REGEX = Pattern.compile("^https?://", Pattern.CASE_INSENSITIVE);

    private final String url;

    public OpenUrlAction(String url) {
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
