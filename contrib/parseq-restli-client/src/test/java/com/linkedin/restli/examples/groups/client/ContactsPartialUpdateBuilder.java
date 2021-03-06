
package com.linkedin.restli.examples.groups.client;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.linkedin.data.schema.validation.ValidationResult;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.PartialUpdateRequestBuilderBase;
import com.linkedin.restli.common.PatchRequest;
import com.linkedin.restli.common.ResourceMethod;
import com.linkedin.restli.common.ResourceSpec;
import com.linkedin.restli.common.validation.RestLiDataValidator;
import com.linkedin.restli.examples.groups.api.GroupContact;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder", date = "Thu Mar 31 14:16:24 PDT 2016")
public class ContactsPartialUpdateBuilder
    extends PartialUpdateRequestBuilderBase<Integer, GroupContact, ContactsPartialUpdateBuilder>
{


    public ContactsPartialUpdateBuilder(String baseUriTemplate, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, GroupContact.class, resourceSpec, requestOptions);
    }

    public static ValidationResult validateInput(PatchRequest<GroupContact> patch) {
        Map<String, List<String>> annotations = new HashMap<String, List<String>>();
        RestLiDataValidator validator = new RestLiDataValidator(annotations, GroupContact.class, ResourceMethod.PARTIAL_UPDATE);
        return validator.validateInput(patch);
    }

    public ContactsPartialUpdateBuilder groupIdKey(Integer key) {
        super.pathKey("groupID", key);
        return this;
    }

}
