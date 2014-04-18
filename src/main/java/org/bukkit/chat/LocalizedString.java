package org.bukkit.chat;

import org.apache.commons.lang.Validate;

/**
 * Represents a localized String.
 * <p>
 * This may be used to send localized text to Minecraft Client
 * through RichMessages.
 */
public class LocalizedString {

    private final String id;

    private Object[] parameters;

    /**
     * Builds a LocalizedString based on the id of the localized String
     * and optional parameters.
     *
     * @param id         the id of the localized String
     * @param parameters the parameters for this localized String
     */
    public LocalizedString(String id, Object... parameters) {
        this.id = id;
        this.parameters = parameters;
    }

    /**
     * Gets the id of this localized String.
     *
     * @return the id of this localized String
     */
    public String getId() {
        return id;
    }

    /**
     * Gets the parameters of this localized String.
     *
     * @return the parameters of this localized String
     */
    public Object[] getParameters() {
        return parameters;
    }

    /**
     * Sets the parameters of this localized String.
     *
     * @param parameters the new parameters of this localized String
     */
    public void setParameters(Object[] parameters) {
        this.parameters = parameters;
    }

    /**
     * Modify a single parameter of this localized String.
     * <p>
     * Cannot be used to add or remove parameters.
     *
     * @param i         the index of the parameter to change
     * @param parameter the new value of the parameter
     */
    public void setParameter(int i, Object parameter) {
        Validate.notNull(parameter, "Cannot set an existing parameter to null");
        Validate.isTrue(i >= 0 && i < this.parameters.length, "Invalid index '" + i + "'");
        this.parameters[i] = parameter;
    }
}
