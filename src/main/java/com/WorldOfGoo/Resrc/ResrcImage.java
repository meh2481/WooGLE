package com.WorldOfGoo.Resrc;

import com.WooGLEFX.Structures.EditorObject;
import com.WooGLEFX.Structures.InputField;
import com.WooGLEFX.Structures.SimpleStructures.MetaEditorAttribute;

public class ResrcImage extends EditorObject {
    public ResrcImage(EditorObject _parent) {
        super(_parent);
        setRealName("Image");
        addAttribute("id", "", InputField.ANY, true);
        addAttribute("path", "", InputField.ANY, true);
        setNameAttribute(getAttribute2("id"));
        setMetaAttributes(MetaEditorAttribute.parse("id,path,"));
    }
}
