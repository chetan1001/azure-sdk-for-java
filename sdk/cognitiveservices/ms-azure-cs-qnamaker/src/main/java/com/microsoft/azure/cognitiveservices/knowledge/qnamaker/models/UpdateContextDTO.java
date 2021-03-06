/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.knowledge.qnamaker.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Update Body schema to represent context to be updated.
 */
public class UpdateContextDTO {
    /**
     * List of prompts associated with qna to be deleted.
     */
    @JsonProperty(value = "promptsToDelete")
    private List<Integer> promptsToDelete;

    /**
     * List of prompts to be added to the qna.
     */
    @JsonProperty(value = "promptsToAdd")
    private List<PromptDTO> promptsToAdd;

    /**
     * To mark if a prompt is relevant only with a previous question or not.
     * true - Do not include this QnA as search result for queries without
     * context
     * false - ignores context and includes this QnA in search result.
     */
    @JsonProperty(value = "isContextOnly")
    private Boolean isContextOnly;

    /**
     * Get the promptsToDelete value.
     *
     * @return the promptsToDelete value
     */
    public List<Integer> promptsToDelete() {
        return this.promptsToDelete;
    }

    /**
     * Set the promptsToDelete value.
     *
     * @param promptsToDelete the promptsToDelete value to set
     * @return the UpdateContextDTO object itself.
     */
    public UpdateContextDTO withPromptsToDelete(List<Integer> promptsToDelete) {
        this.promptsToDelete = promptsToDelete;
        return this;
    }

    /**
     * Get the promptsToAdd value.
     *
     * @return the promptsToAdd value
     */
    public List<PromptDTO> promptsToAdd() {
        return this.promptsToAdd;
    }

    /**
     * Set the promptsToAdd value.
     *
     * @param promptsToAdd the promptsToAdd value to set
     * @return the UpdateContextDTO object itself.
     */
    public UpdateContextDTO withPromptsToAdd(List<PromptDTO> promptsToAdd) {
        this.promptsToAdd = promptsToAdd;
        return this;
    }

    /**
     * Get the isContextOnly value.
     *
     * @return the isContextOnly value
     */
    public Boolean isContextOnly() {
        return this.isContextOnly;
    }

    /**
     * Set the isContextOnly value.
     *
     * @param isContextOnly the isContextOnly value to set
     * @return the UpdateContextDTO object itself.
     */
    public UpdateContextDTO withIsContextOnly(Boolean isContextOnly) {
        this.isContextOnly = isContextOnly;
        return this;
    }

}
