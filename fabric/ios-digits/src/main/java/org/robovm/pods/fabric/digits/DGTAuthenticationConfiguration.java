/*
 * Copyright (c) 2015, RoboVM AB. All Rights Reserved.
 *
 * Redistribution and use is subject to the RoboVM Software License terms
 * available at (http://robovm.com)
 *
 * This notice and attribution to RoboVM AB may not be removed.
 */
package org.robovm.pods.fabric.digits;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.addressbook.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.uikit.*;
import org.robovm.pods.fabric.twitter.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/DGTAuthenticationConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class DGTAuthenticationConfigurationPtr extends Ptr<DGTAuthenticationConfiguration, DGTAuthenticationConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(DGTAuthenticationConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected DGTAuthenticationConfiguration(Handle h, long handle) { super(h, handle); }
    protected DGTAuthenticationConfiguration(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAccountFields:")
    public DGTAuthenticationConfiguration(DGTAccountFields accountFields) { super((SkipInit) null); initObject(init(accountFields)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "appearance")
    public native DGTAppearance getAppearance();
    @Property(selector = "setAppearance:")
    public native void setAppearance(DGTAppearance v);
    @Property(selector = "phoneNumber")
    public native String getPhoneNumber();
    @Property(selector = "setPhoneNumber:")
    public native void setPhoneNumber(String v);
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "setTitle:")
    public native void setTitle(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAccountFields:")
    protected native @Pointer long init(DGTAccountFields accountFields);
    /*</methods>*/
}
