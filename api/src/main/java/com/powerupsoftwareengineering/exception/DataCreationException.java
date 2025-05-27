package com.powerupsoftwareengineering.exception;

import java.io.Serial;

/**
 * A <code>DataCreationException</code> represents an error in creating data content.
 * Depending on the implementation of the data service, this could be a web error, file IO, etc.
 *
 * @author Chris Picard
 */
public class DataCreationException extends Exception {
    /**
     * Serial Version ID implements the {@link java.io.Serializable} contract.
     */
    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * Base constructor taking an error message.
     *
     * @param message Error message describing what caused the exception.
     */
    public DataCreationException(final String message) {
        super(message);
    }

    /**
     * Base constructor taking an error message.
     *
     * @param message Error message describing what caused the exception.
     * @param cause Exception that caused this exception to be generated.
     */
    public DataCreationException(final String message, final Throwable cause) {
        super(message, cause);
    }
}