package com.beyondid.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.beyondid.data.Credentials;
import com.beyondid.data.OktaUsers;
import com.beyondid.data.Profile;
import com.beyondid.data.Question;
import com.beyondid.service.OktaService;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

@ContextConfiguration(classes = {OktaServiceController.class})
@ExtendWith(SpringExtension.class)
class OktaServiceControllerTest {
    @MockBean
    private OktaService oktaService;

    @Autowired
    private OktaServiceController oktaServiceController;

    /**
     * Method under test: {@link OktaServiceController#addOktaUserForm(Model)}
     */
    @Test
    void testAddOktaUserForm() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: Failed to load ApplicationContext
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
        //       at java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:1002)
        //       at java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)
        //       at java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:647)
        //   java.lang.IllegalStateException: Could not initialize plugin: interface org.mockito.plugins.MockMaker (alternate: null)
        //       at org.mockito.internal.configuration.plugins.PluginLoader$1.invoke(PluginLoader.java:84)
        //       at jdk.proxy3.$Proxy21.isTypeMockable(null)
        //       at org.mockito.internal.util.MockUtil.typeMockabilityOf(MockUtil.java:78)
        //       at org.mockito.internal.util.MockCreationValidator.validateType(MockCreationValidator.java:22)
        //       at org.mockito.internal.creation.MockSettingsImpl.validatedSettings(MockSettingsImpl.java:267)
        //       at org.mockito.internal.creation.MockSettingsImpl.build(MockSettingsImpl.java:234)
        //       at org.mockito.internal.MockitoCore.mock(MockitoCore.java:86)
        //       at org.mockito.Mockito.mock(Mockito.java:2037)
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
        //       at java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:1002)
        //       at java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)
        //       at java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:647)
        //   java.lang.IllegalStateException: Internal problem occurred, please report it. Mockito is unable to load the default implementation of class that is a part of Mockito distribution. Failed to load interface org.mockito.plugins.MockMaker
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:97)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.reflect.InvocationTargetException
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   org.mockito.exceptions.base.MockitoInitializationException:
        //   It seems like you are running Mockito with an incomplete or inconsistent class path. Byte Buddy could not be loaded.
        //   Byte Buddy is available on Maven Central as 'net.bytebuddy:byte-buddy' with the module name 'net.bytebuddy'.
        //   For the inline mock maker, 'net.bytebuddy:byte-buddy-agent' with the module name 'net.bytebuddy.agent' is also required.
        //   Normally, your IDE or build tool (such as Maven or Gradle) should take care of your class path completion but
        //       at org.mockito.internal.exceptions.Reporter.missingByteBuddyDependency(Reporter.java:1131)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:31)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.NoClassDefFoundError: net/bytebuddy/utility/GraalImageCode
        //       at org.mockito.internal.creation.bytebuddy.SubclassInjectionLoader.<init>(SubclassInjectionLoader.java:34)
        //       at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.<init>(SubclassByteBuddyMockMaker.java:33)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:29)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.ClassNotFoundException: net.bytebuddy.utility.GraalImageCode
        //       at org.mockito.internal.creation.bytebuddy.SubclassInjectionLoader.<init>(SubclassInjectionLoader.java:34)
        //       at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.<init>(SubclassByteBuddyMockMaker.java:33)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:29)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   See https://diff.blue/R026 to resolve this issue.

        OktaServiceController oktaServiceController = new OktaServiceController();
        assertEquals("oktas/addUser", oktaServiceController.addOktaUserForm(new ConcurrentModel()));
    }

    /**
     * Method under test: {@link OktaServiceController#addOktaUserFormWithPassword(OktaUsers)}
     */
    @Test
    void testAddOktaUserFormWithPassword() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: Failed to load ApplicationContext
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
        //       at java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:1002)
        //       at java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)
        //       at java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:647)
        //   java.lang.IllegalStateException: Could not initialize plugin: interface org.mockito.plugins.MockMaker (alternate: null)
        //       at org.mockito.internal.configuration.plugins.PluginLoader$1.invoke(PluginLoader.java:84)
        //       at jdk.proxy3.$Proxy21.isTypeMockable(null)
        //       at org.mockito.internal.util.MockUtil.typeMockabilityOf(MockUtil.java:78)
        //       at org.mockito.internal.util.MockCreationValidator.validateType(MockCreationValidator.java:22)
        //       at org.mockito.internal.creation.MockSettingsImpl.validatedSettings(MockSettingsImpl.java:267)
        //       at org.mockito.internal.creation.MockSettingsImpl.build(MockSettingsImpl.java:234)
        //       at org.mockito.internal.MockitoCore.mock(MockitoCore.java:86)
        //       at org.mockito.Mockito.mock(Mockito.java:2037)
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
        //       at java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:1002)
        //       at java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)
        //       at java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:647)
        //   java.lang.IllegalStateException: Internal problem occurred, please report it. Mockito is unable to load the default implementation of class that is a part of Mockito distribution. Failed to load interface org.mockito.plugins.MockMaker
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:97)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.reflect.InvocationTargetException
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   org.mockito.exceptions.base.MockitoInitializationException:
        //   It seems like you are running Mockito with an incomplete or inconsistent class path. Byte Buddy could not be loaded.
        //   Byte Buddy is available on Maven Central as 'net.bytebuddy:byte-buddy' with the module name 'net.bytebuddy'.
        //   For the inline mock maker, 'net.bytebuddy:byte-buddy-agent' with the module name 'net.bytebuddy.agent' is also required.
        //   Normally, your IDE or build tool (such as Maven or Gradle) should take care of your class path completion but
        //       at org.mockito.internal.exceptions.Reporter.missingByteBuddyDependency(Reporter.java:1131)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:31)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.NoClassDefFoundError: net/bytebuddy/utility/GraalImageCode
        //       at org.mockito.internal.creation.bytebuddy.SubclassInjectionLoader.<init>(SubclassInjectionLoader.java:34)
        //       at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.<init>(SubclassByteBuddyMockMaker.java:33)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:29)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.ClassNotFoundException: net.bytebuddy.utility.GraalImageCode
        //       at org.mockito.internal.creation.bytebuddy.SubclassInjectionLoader.<init>(SubclassInjectionLoader.java:34)
        //       at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.<init>(SubclassByteBuddyMockMaker.java:33)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:29)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   See https://diff.blue/R026 to resolve this issue.

        OktaServiceController oktaServiceController = new OktaServiceController();
        assertEquals("oktas/addUserswithpassword",
                oktaServiceController.addOktaUserFormWithPassword(new OktaUsers("janedoe", "iloveyou")));
    }

    /**
     * Method under test: {@link OktaServiceController#addOktaUserFormWithRecovery(OktaUsers)}
     */
    @Test
    void testAddOktaUserFormWithRecovery() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: Failed to load ApplicationContext
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
        //       at java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:1002)
        //       at java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)
        //       at java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:647)
        //   java.lang.IllegalStateException: Could not initialize plugin: interface org.mockito.plugins.MockMaker (alternate: null)
        //       at org.mockito.internal.configuration.plugins.PluginLoader$1.invoke(PluginLoader.java:84)
        //       at jdk.proxy3.$Proxy21.isTypeMockable(null)
        //       at org.mockito.internal.util.MockUtil.typeMockabilityOf(MockUtil.java:78)
        //       at org.mockito.internal.util.MockCreationValidator.validateType(MockCreationValidator.java:22)
        //       at org.mockito.internal.creation.MockSettingsImpl.validatedSettings(MockSettingsImpl.java:267)
        //       at org.mockito.internal.creation.MockSettingsImpl.build(MockSettingsImpl.java:234)
        //       at org.mockito.internal.MockitoCore.mock(MockitoCore.java:86)
        //       at org.mockito.Mockito.mock(Mockito.java:2037)
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
        //       at java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:1002)
        //       at java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)
        //       at java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:647)
        //   java.lang.IllegalStateException: Internal problem occurred, please report it. Mockito is unable to load the default implementation of class that is a part of Mockito distribution. Failed to load interface org.mockito.plugins.MockMaker
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:97)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.reflect.InvocationTargetException
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   org.mockito.exceptions.base.MockitoInitializationException:
        //   It seems like you are running Mockito with an incomplete or inconsistent class path. Byte Buddy could not be loaded.
        //   Byte Buddy is available on Maven Central as 'net.bytebuddy:byte-buddy' with the module name 'net.bytebuddy'.
        //   For the inline mock maker, 'net.bytebuddy:byte-buddy-agent' with the module name 'net.bytebuddy.agent' is also required.
        //   Normally, your IDE or build tool (such as Maven or Gradle) should take care of your class path completion but
        //       at org.mockito.internal.exceptions.Reporter.missingByteBuddyDependency(Reporter.java:1131)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:31)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.NoClassDefFoundError: net/bytebuddy/utility/GraalImageCode
        //       at org.mockito.internal.creation.bytebuddy.SubclassInjectionLoader.<init>(SubclassInjectionLoader.java:34)
        //       at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.<init>(SubclassByteBuddyMockMaker.java:33)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:29)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.ClassNotFoundException: net.bytebuddy.utility.GraalImageCode
        //       at org.mockito.internal.creation.bytebuddy.SubclassInjectionLoader.<init>(SubclassInjectionLoader.java:34)
        //       at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.<init>(SubclassByteBuddyMockMaker.java:33)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:29)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   See https://diff.blue/R026 to resolve this issue.

        OktaServiceController oktaServiceController = new OktaServiceController();
        assertEquals("oktas/addUserswithRecovery",
                oktaServiceController.addOktaUserFormWithRecovery(new OktaUsers("janedoe", "iloveyou")));
    }

    /**
     * Method under test: {@link OktaServiceController#addOktaUserFormInGroups(OktaUsers)}
     */
    @Test
    void testAddOktaUserFormInGroups() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: Failed to load ApplicationContext
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
        //       at java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:1002)
        //       at java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)
        //       at java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:647)
        //   java.lang.IllegalStateException: Could not initialize plugin: interface org.mockito.plugins.MockMaker (alternate: null)
        //       at org.mockito.internal.configuration.plugins.PluginLoader$1.invoke(PluginLoader.java:84)
        //       at jdk.proxy3.$Proxy21.isTypeMockable(null)
        //       at org.mockito.internal.util.MockUtil.typeMockabilityOf(MockUtil.java:78)
        //       at org.mockito.internal.util.MockCreationValidator.validateType(MockCreationValidator.java:22)
        //       at org.mockito.internal.creation.MockSettingsImpl.validatedSettings(MockSettingsImpl.java:267)
        //       at org.mockito.internal.creation.MockSettingsImpl.build(MockSettingsImpl.java:234)
        //       at org.mockito.internal.MockitoCore.mock(MockitoCore.java:86)
        //       at org.mockito.Mockito.mock(Mockito.java:2037)
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
        //       at java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:1002)
        //       at java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)
        //       at java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:647)
        //   java.lang.IllegalStateException: Internal problem occurred, please report it. Mockito is unable to load the default implementation of class that is a part of Mockito distribution. Failed to load interface org.mockito.plugins.MockMaker
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:97)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.reflect.InvocationTargetException
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   org.mockito.exceptions.base.MockitoInitializationException:
        //   It seems like you are running Mockito with an incomplete or inconsistent class path. Byte Buddy could not be loaded.
        //   Byte Buddy is available on Maven Central as 'net.bytebuddy:byte-buddy' with the module name 'net.bytebuddy'.
        //   For the inline mock maker, 'net.bytebuddy:byte-buddy-agent' with the module name 'net.bytebuddy.agent' is also required.
        //   Normally, your IDE or build tool (such as Maven or Gradle) should take care of your class path completion but
        //       at org.mockito.internal.exceptions.Reporter.missingByteBuddyDependency(Reporter.java:1131)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:31)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.NoClassDefFoundError: net/bytebuddy/utility/GraalImageCode
        //       at org.mockito.internal.creation.bytebuddy.SubclassInjectionLoader.<init>(SubclassInjectionLoader.java:34)
        //       at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.<init>(SubclassByteBuddyMockMaker.java:33)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:29)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.ClassNotFoundException: net.bytebuddy.utility.GraalImageCode
        //       at org.mockito.internal.creation.bytebuddy.SubclassInjectionLoader.<init>(SubclassInjectionLoader.java:34)
        //       at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.<init>(SubclassByteBuddyMockMaker.java:33)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:29)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   See https://diff.blue/R026 to resolve this issue.

        OktaServiceController oktaServiceController = new OktaServiceController();
        assertEquals("oktas/addUsersinGroups",
                oktaServiceController.addOktaUserFormInGroups(new OktaUsers("janedoe", "iloveyou")));
    }

    /**
     * Method under test: {@link OktaServiceController#addPassword(OktaUsers)}
     */
    @Test
    void testAddPassword() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: Failed to load ApplicationContext
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
        //       at java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:1002)
        //       at java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)
        //       at java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:647)
        //   java.lang.IllegalStateException: Could not initialize plugin: interface org.mockito.plugins.MockMaker (alternate: null)
        //       at org.mockito.internal.configuration.plugins.PluginLoader$1.invoke(PluginLoader.java:84)
        //       at jdk.proxy3.$Proxy21.isTypeMockable(null)
        //       at org.mockito.internal.util.MockUtil.typeMockabilityOf(MockUtil.java:78)
        //       at org.mockito.internal.util.MockCreationValidator.validateType(MockCreationValidator.java:22)
        //       at org.mockito.internal.creation.MockSettingsImpl.validatedSettings(MockSettingsImpl.java:267)
        //       at org.mockito.internal.creation.MockSettingsImpl.build(MockSettingsImpl.java:234)
        //       at org.mockito.internal.MockitoCore.mock(MockitoCore.java:86)
        //       at org.mockito.Mockito.mock(Mockito.java:2037)
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
        //       at java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:1002)
        //       at java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)
        //       at java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:647)
        //   java.lang.IllegalStateException: Internal problem occurred, please report it. Mockito is unable to load the default implementation of class that is a part of Mockito distribution. Failed to load interface org.mockito.plugins.MockMaker
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:97)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.reflect.InvocationTargetException
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   org.mockito.exceptions.base.MockitoInitializationException:
        //   It seems like you are running Mockito with an incomplete or inconsistent class path. Byte Buddy could not be loaded.
        //   Byte Buddy is available on Maven Central as 'net.bytebuddy:byte-buddy' with the module name 'net.bytebuddy'.
        //   For the inline mock maker, 'net.bytebuddy:byte-buddy-agent' with the module name 'net.bytebuddy.agent' is also required.
        //   Normally, your IDE or build tool (such as Maven or Gradle) should take care of your class path completion but
        //       at org.mockito.internal.exceptions.Reporter.missingByteBuddyDependency(Reporter.java:1131)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:31)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.NoClassDefFoundError: net/bytebuddy/utility/GraalImageCode
        //       at org.mockito.internal.creation.bytebuddy.SubclassInjectionLoader.<init>(SubclassInjectionLoader.java:34)
        //       at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.<init>(SubclassByteBuddyMockMaker.java:33)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:29)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.ClassNotFoundException: net.bytebuddy.utility.GraalImageCode
        //       at org.mockito.internal.creation.bytebuddy.SubclassInjectionLoader.<init>(SubclassInjectionLoader.java:34)
        //       at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.<init>(SubclassByteBuddyMockMaker.java:33)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:29)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   See https://diff.blue/R026 to resolve this issue.

        OktaServiceController oktaServiceController = new OktaServiceController();
        assertEquals("oktas/addPassword", oktaServiceController.addPassword(new OktaUsers("janedoe", "iloveyou")));
    }

    /**
     * Method under test: {@link OktaServiceController#saveOktaUserWithRecoveryQuestion(OktaUsers)}
     */
    @Test
    void testSaveOktaUserWithRecoveryQuestion() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: Failed to load ApplicationContext
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
        //       at java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:1002)
        //       at java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)
        //       at java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:647)
        //   java.lang.IllegalStateException: Could not initialize plugin: interface org.mockito.plugins.MockMaker (alternate: null)
        //       at org.mockito.internal.configuration.plugins.PluginLoader$1.invoke(PluginLoader.java:84)
        //       at jdk.proxy3.$Proxy21.isTypeMockable(null)
        //       at org.mockito.internal.util.MockUtil.typeMockabilityOf(MockUtil.java:78)
        //       at org.mockito.internal.util.MockCreationValidator.validateType(MockCreationValidator.java:22)
        //       at org.mockito.internal.creation.MockSettingsImpl.validatedSettings(MockSettingsImpl.java:267)
        //       at org.mockito.internal.creation.MockSettingsImpl.build(MockSettingsImpl.java:234)
        //       at org.mockito.internal.MockitoCore.mock(MockitoCore.java:86)
        //       at org.mockito.Mockito.mock(Mockito.java:2037)
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
        //       at java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:1002)
        //       at java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)
        //       at java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:647)
        //   java.lang.IllegalStateException: Internal problem occurred, please report it. Mockito is unable to load the default implementation of class that is a part of Mockito distribution. Failed to load interface org.mockito.plugins.MockMaker
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:97)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.reflect.InvocationTargetException
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   org.mockito.exceptions.base.MockitoInitializationException:
        //   It seems like you are running Mockito with an incomplete or inconsistent class path. Byte Buddy could not be loaded.
        //   Byte Buddy is available on Maven Central as 'net.bytebuddy:byte-buddy' with the module name 'net.bytebuddy'.
        //   For the inline mock maker, 'net.bytebuddy:byte-buddy-agent' with the module name 'net.bytebuddy.agent' is also required.
        //   Normally, your IDE or build tool (such as Maven or Gradle) should take care of your class path completion but
        //       at org.mockito.internal.exceptions.Reporter.missingByteBuddyDependency(Reporter.java:1131)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:31)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.NoClassDefFoundError: net/bytebuddy/utility/GraalImageCode
        //       at org.mockito.internal.creation.bytebuddy.SubclassInjectionLoader.<init>(SubclassInjectionLoader.java:34)
        //       at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.<init>(SubclassByteBuddyMockMaker.java:33)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:29)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.ClassNotFoundException: net.bytebuddy.utility.GraalImageCode
        //       at org.mockito.internal.creation.bytebuddy.SubclassInjectionLoader.<init>(SubclassInjectionLoader.java:34)
        //       at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.<init>(SubclassByteBuddyMockMaker.java:33)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:29)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   See https://diff.blue/R026 to resolve this issue.

        OktaServiceController oktaServiceController = new OktaServiceController();
        assertEquals("redirect:/okta/userList",
                oktaServiceController.saveOktaUserWithRecoveryQuestion(new OktaUsers("janedoe", "iloveyou")));
    }

    /**
     * Method under test: {@link OktaServiceController#activateOktaUser(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testActivateOktaUser() throws Exception {
        // TODO: Complete this test.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: Failed to load ApplicationContext
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
        //       at java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:1002)
        //       at java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)
        //       at java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:647)
        //   java.lang.IllegalStateException: Could not initialize plugin: interface org.mockito.plugins.MockMaker (alternate: null)
        //       at org.mockito.internal.configuration.plugins.PluginLoader$1.invoke(PluginLoader.java:84)
        //       at jdk.proxy3.$Proxy21.isTypeMockable(null)
        //       at org.mockito.internal.util.MockUtil.typeMockabilityOf(MockUtil.java:78)
        //       at org.mockito.internal.util.MockCreationValidator.validateType(MockCreationValidator.java:22)
        //       at org.mockito.internal.creation.MockSettingsImpl.validatedSettings(MockSettingsImpl.java:267)
        //       at org.mockito.internal.creation.MockSettingsImpl.build(MockSettingsImpl.java:234)
        //       at org.mockito.internal.MockitoCore.mock(MockitoCore.java:86)
        //       at org.mockito.Mockito.mock(Mockito.java:2037)
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
        //       at java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:1002)
        //       at java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)
        //       at java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:647)
        //   java.lang.IllegalStateException: Internal problem occurred, please report it. Mockito is unable to load the default implementation of class that is a part of Mockito distribution. Failed to load interface org.mockito.plugins.MockMaker
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:97)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.reflect.InvocationTargetException
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   org.mockito.exceptions.base.MockitoInitializationException:
        //   It seems like you are running Mockito with an incomplete or inconsistent class path. Byte Buddy could not be loaded.
        //   Byte Buddy is available on Maven Central as 'net.bytebuddy:byte-buddy' with the module name 'net.bytebuddy'.
        //   For the inline mock maker, 'net.bytebuddy:byte-buddy-agent' with the module name 'net.bytebuddy.agent' is also required.
        //   Normally, your IDE or build tool (such as Maven or Gradle) should take care of your class path completion but
        //       at org.mockito.internal.exceptions.Reporter.missingByteBuddyDependency(Reporter.java:1131)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:31)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.NoClassDefFoundError: net/bytebuddy/utility/GraalImageCode
        //       at org.mockito.internal.creation.bytebuddy.SubclassInjectionLoader.<init>(SubclassInjectionLoader.java:34)
        //       at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.<init>(SubclassByteBuddyMockMaker.java:33)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:29)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.ClassNotFoundException: net.bytebuddy.utility.GraalImageCode
        //       at org.mockito.internal.creation.bytebuddy.SubclassInjectionLoader.<init>(SubclassInjectionLoader.java:34)
        //       at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.<init>(SubclassByteBuddyMockMaker.java:33)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:29)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   See https://diff.blue/R026 to resolve this issue.

        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/okta/activateOktaUser")
                .param("id", "foo");
        MockMvcBuilders.standaloneSetup(oktaServiceController).build().perform(requestBuilder);
    }

    /**
     * Method under test: {@link OktaServiceController#addAuthentication(OktaUsers)}
     */
    @Test
    void testAddAuthentication() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: Failed to load ApplicationContext
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
        //       at java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:1002)
        //       at java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)
        //       at java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:647)
        //   java.lang.IllegalStateException: Could not initialize plugin: interface org.mockito.plugins.MockMaker (alternate: null)
        //       at org.mockito.internal.configuration.plugins.PluginLoader$1.invoke(PluginLoader.java:84)
        //       at jdk.proxy3.$Proxy21.isTypeMockable(null)
        //       at org.mockito.internal.util.MockUtil.typeMockabilityOf(MockUtil.java:78)
        //       at org.mockito.internal.util.MockCreationValidator.validateType(MockCreationValidator.java:22)
        //       at org.mockito.internal.creation.MockSettingsImpl.validatedSettings(MockSettingsImpl.java:267)
        //       at org.mockito.internal.creation.MockSettingsImpl.build(MockSettingsImpl.java:234)
        //       at org.mockito.internal.MockitoCore.mock(MockitoCore.java:86)
        //       at org.mockito.Mockito.mock(Mockito.java:2037)
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
        //       at java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:1002)
        //       at java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)
        //       at java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:647)
        //   java.lang.IllegalStateException: Internal problem occurred, please report it. Mockito is unable to load the default implementation of class that is a part of Mockito distribution. Failed to load interface org.mockito.plugins.MockMaker
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:97)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.reflect.InvocationTargetException
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   org.mockito.exceptions.base.MockitoInitializationException:
        //   It seems like you are running Mockito with an incomplete or inconsistent class path. Byte Buddy could not be loaded.
        //   Byte Buddy is available on Maven Central as 'net.bytebuddy:byte-buddy' with the module name 'net.bytebuddy'.
        //   For the inline mock maker, 'net.bytebuddy:byte-buddy-agent' with the module name 'net.bytebuddy.agent' is also required.
        //   Normally, your IDE or build tool (such as Maven or Gradle) should take care of your class path completion but
        //       at org.mockito.internal.exceptions.Reporter.missingByteBuddyDependency(Reporter.java:1131)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:31)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.NoClassDefFoundError: net/bytebuddy/utility/GraalImageCode
        //       at org.mockito.internal.creation.bytebuddy.SubclassInjectionLoader.<init>(SubclassInjectionLoader.java:34)
        //       at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.<init>(SubclassByteBuddyMockMaker.java:33)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:29)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.ClassNotFoundException: net.bytebuddy.utility.GraalImageCode
        //       at org.mockito.internal.creation.bytebuddy.SubclassInjectionLoader.<init>(SubclassInjectionLoader.java:34)
        //       at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.<init>(SubclassByteBuddyMockMaker.java:33)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:29)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   See https://diff.blue/R026 to resolve this issue.

        OktaServiceController oktaServiceController = new OktaServiceController();
        assertEquals("oktas/authentication",
                oktaServiceController.addAuthentication(new OktaUsers("janedoe", "iloveyou")));
    }

    /**
     * Method under test: {@link OktaServiceController#addforgetPasswordWithSecurityAnswer(OktaUsers, Credentials)}
     */
    @Test
    void testAddforgetPasswordWithSecurityAnswer() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: Failed to load ApplicationContext
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
        //       at java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:1002)
        //       at java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)
        //       at java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:647)
        //   java.lang.IllegalStateException: Could not initialize plugin: interface org.mockito.plugins.MockMaker (alternate: null)
        //       at org.mockito.internal.configuration.plugins.PluginLoader$1.invoke(PluginLoader.java:84)
        //       at jdk.proxy3.$Proxy21.isTypeMockable(null)
        //       at org.mockito.internal.util.MockUtil.typeMockabilityOf(MockUtil.java:78)
        //       at org.mockito.internal.util.MockCreationValidator.validateType(MockCreationValidator.java:22)
        //       at org.mockito.internal.creation.MockSettingsImpl.validatedSettings(MockSettingsImpl.java:267)
        //       at org.mockito.internal.creation.MockSettingsImpl.build(MockSettingsImpl.java:234)
        //       at org.mockito.internal.MockitoCore.mock(MockitoCore.java:86)
        //       at org.mockito.Mockito.mock(Mockito.java:2037)
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
        //       at java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:1002)
        //       at java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)
        //       at java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:647)
        //   java.lang.IllegalStateException: Internal problem occurred, please report it. Mockito is unable to load the default implementation of class that is a part of Mockito distribution. Failed to load interface org.mockito.plugins.MockMaker
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:97)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.reflect.InvocationTargetException
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   org.mockito.exceptions.base.MockitoInitializationException:
        //   It seems like you are running Mockito with an incomplete or inconsistent class path. Byte Buddy could not be loaded.
        //   Byte Buddy is available on Maven Central as 'net.bytebuddy:byte-buddy' with the module name 'net.bytebuddy'.
        //   For the inline mock maker, 'net.bytebuddy:byte-buddy-agent' with the module name 'net.bytebuddy.agent' is also required.
        //   Normally, your IDE or build tool (such as Maven or Gradle) should take care of your class path completion but
        //       at org.mockito.internal.exceptions.Reporter.missingByteBuddyDependency(Reporter.java:1131)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:31)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.NoClassDefFoundError: net/bytebuddy/utility/GraalImageCode
        //       at org.mockito.internal.creation.bytebuddy.SubclassInjectionLoader.<init>(SubclassInjectionLoader.java:34)
        //       at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.<init>(SubclassByteBuddyMockMaker.java:33)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:29)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.ClassNotFoundException: net.bytebuddy.utility.GraalImageCode
        //       at org.mockito.internal.creation.bytebuddy.SubclassInjectionLoader.<init>(SubclassInjectionLoader.java:34)
        //       at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.<init>(SubclassByteBuddyMockMaker.java:33)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:29)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   See https://diff.blue/R026 to resolve this issue.

        OktaServiceController oktaServiceController = new OktaServiceController();
        OktaUsers oktaUsers = new OktaUsers("janedoe", "iloveyou");

        assertEquals("oktas/forgetPassword",
                oktaServiceController.addforgetPasswordWithSecurityAnswer(oktaUsers, new Credentials()));
    }

    /**
     * Method under test: {@link OktaServiceController#addOktaUserFormWithResetPassword(OktaUsers)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAddOktaUserFormWithResetPassword() throws Exception {
        // TODO: Complete this test.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: Failed to load ApplicationContext
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
        //       at java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:1002)
        //       at java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)
        //       at java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:647)
        //   java.lang.IllegalStateException: Could not initialize plugin: interface org.mockito.plugins.MockMaker (alternate: null)
        //       at org.mockito.internal.configuration.plugins.PluginLoader$1.invoke(PluginLoader.java:84)
        //       at jdk.proxy3.$Proxy21.isTypeMockable(null)
        //       at org.mockito.internal.util.MockUtil.typeMockabilityOf(MockUtil.java:78)
        //       at org.mockito.internal.util.MockCreationValidator.validateType(MockCreationValidator.java:22)
        //       at org.mockito.internal.creation.MockSettingsImpl.validatedSettings(MockSettingsImpl.java:267)
        //       at org.mockito.internal.creation.MockSettingsImpl.build(MockSettingsImpl.java:234)
        //       at org.mockito.internal.MockitoCore.mock(MockitoCore.java:86)
        //       at org.mockito.Mockito.mock(Mockito.java:2037)
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
        //       at java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:1002)
        //       at java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)
        //       at java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:647)
        //   java.lang.IllegalStateException: Internal problem occurred, please report it. Mockito is unable to load the default implementation of class that is a part of Mockito distribution. Failed to load interface org.mockito.plugins.MockMaker
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:97)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.reflect.InvocationTargetException
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   org.mockito.exceptions.base.MockitoInitializationException:
        //   It seems like you are running Mockito with an incomplete or inconsistent class path. Byte Buddy could not be loaded.
        //   Byte Buddy is available on Maven Central as 'net.bytebuddy:byte-buddy' with the module name 'net.bytebuddy'.
        //   For the inline mock maker, 'net.bytebuddy:byte-buddy-agent' with the module name 'net.bytebuddy.agent' is also required.
        //   Normally, your IDE or build tool (such as Maven or Gradle) should take care of your class path completion but
        //       at org.mockito.internal.exceptions.Reporter.missingByteBuddyDependency(Reporter.java:1131)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:31)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.NoClassDefFoundError: net/bytebuddy/utility/GraalImageCode
        //       at org.mockito.internal.creation.bytebuddy.SubclassInjectionLoader.<init>(SubclassInjectionLoader.java:34)
        //       at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.<init>(SubclassByteBuddyMockMaker.java:33)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:29)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.ClassNotFoundException: net.bytebuddy.utility.GraalImageCode
        //       at org.mockito.internal.creation.bytebuddy.SubclassInjectionLoader.<init>(SubclassInjectionLoader.java:34)
        //       at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.<init>(SubclassByteBuddyMockMaker.java:33)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:29)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   See https://diff.blue/R026 to resolve this issue.

        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders
                .get("/okta/addOktaUserFormWithResetPassword");
        MockMvcBuilders.standaloneSetup(oktaServiceController).build().perform(requestBuilder);
    }

    /**
     * Method under test: {@link OktaServiceController#deactivateOktaUser(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDeactivateOktaUser() throws Exception {
        // TODO: Complete this test.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: Failed to load ApplicationContext
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
        //       at java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:1002)
        //       at java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)
        //       at java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:647)
        //   java.lang.IllegalStateException: Could not initialize plugin: interface org.mockito.plugins.MockMaker (alternate: null)
        //       at org.mockito.internal.configuration.plugins.PluginLoader$1.invoke(PluginLoader.java:84)
        //       at jdk.proxy3.$Proxy21.isTypeMockable(null)
        //       at org.mockito.internal.util.MockUtil.typeMockabilityOf(MockUtil.java:78)
        //       at org.mockito.internal.util.MockCreationValidator.validateType(MockCreationValidator.java:22)
        //       at org.mockito.internal.creation.MockSettingsImpl.validatedSettings(MockSettingsImpl.java:267)
        //       at org.mockito.internal.creation.MockSettingsImpl.build(MockSettingsImpl.java:234)
        //       at org.mockito.internal.MockitoCore.mock(MockitoCore.java:86)
        //       at org.mockito.Mockito.mock(Mockito.java:2037)
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
        //       at java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:1002)
        //       at java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)
        //       at java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:647)
        //   java.lang.IllegalStateException: Internal problem occurred, please report it. Mockito is unable to load the default implementation of class that is a part of Mockito distribution. Failed to load interface org.mockito.plugins.MockMaker
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:97)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.reflect.InvocationTargetException
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   org.mockito.exceptions.base.MockitoInitializationException:
        //   It seems like you are running Mockito with an incomplete or inconsistent class path. Byte Buddy could not be loaded.
        //   Byte Buddy is available on Maven Central as 'net.bytebuddy:byte-buddy' with the module name 'net.bytebuddy'.
        //   For the inline mock maker, 'net.bytebuddy:byte-buddy-agent' with the module name 'net.bytebuddy.agent' is also required.
        //   Normally, your IDE or build tool (such as Maven or Gradle) should take care of your class path completion but
        //       at org.mockito.internal.exceptions.Reporter.missingByteBuddyDependency(Reporter.java:1131)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:31)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.NoClassDefFoundError: net/bytebuddy/utility/GraalImageCode
        //       at org.mockito.internal.creation.bytebuddy.SubclassInjectionLoader.<init>(SubclassInjectionLoader.java:34)
        //       at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.<init>(SubclassByteBuddyMockMaker.java:33)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:29)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.ClassNotFoundException: net.bytebuddy.utility.GraalImageCode
        //       at org.mockito.internal.creation.bytebuddy.SubclassInjectionLoader.<init>(SubclassInjectionLoader.java:34)
        //       at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.<init>(SubclassByteBuddyMockMaker.java:33)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:29)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   See https://diff.blue/R026 to resolve this issue.

        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/okta/deactivateOktaUser")
                .param("id", "foo");
        MockMvcBuilders.standaloneSetup(oktaServiceController).build().perform(requestBuilder);
    }

    /**
     * Method under test: {@link OktaServiceController#deleteOktaUser(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDeleteOktaUser() throws Exception {
        // TODO: Complete this test.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: Failed to load ApplicationContext
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
        //       at java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:1002)
        //       at java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)
        //       at java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:647)
        //   java.lang.IllegalStateException: Could not initialize plugin: interface org.mockito.plugins.MockMaker (alternate: null)
        //       at org.mockito.internal.configuration.plugins.PluginLoader$1.invoke(PluginLoader.java:84)
        //       at jdk.proxy3.$Proxy21.isTypeMockable(null)
        //       at org.mockito.internal.util.MockUtil.typeMockabilityOf(MockUtil.java:78)
        //       at org.mockito.internal.util.MockCreationValidator.validateType(MockCreationValidator.java:22)
        //       at org.mockito.internal.creation.MockSettingsImpl.validatedSettings(MockSettingsImpl.java:267)
        //       at org.mockito.internal.creation.MockSettingsImpl.build(MockSettingsImpl.java:234)
        //       at org.mockito.internal.MockitoCore.mock(MockitoCore.java:86)
        //       at org.mockito.Mockito.mock(Mockito.java:2037)
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
        //       at java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:1002)
        //       at java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)
        //       at java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:647)
        //   java.lang.IllegalStateException: Internal problem occurred, please report it. Mockito is unable to load the default implementation of class that is a part of Mockito distribution. Failed to load interface org.mockito.plugins.MockMaker
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:97)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.reflect.InvocationTargetException
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   org.mockito.exceptions.base.MockitoInitializationException:
        //   It seems like you are running Mockito with an incomplete or inconsistent class path. Byte Buddy could not be loaded.
        //   Byte Buddy is available on Maven Central as 'net.bytebuddy:byte-buddy' with the module name 'net.bytebuddy'.
        //   For the inline mock maker, 'net.bytebuddy:byte-buddy-agent' with the module name 'net.bytebuddy.agent' is also required.
        //   Normally, your IDE or build tool (such as Maven or Gradle) should take care of your class path completion but
        //       at org.mockito.internal.exceptions.Reporter.missingByteBuddyDependency(Reporter.java:1131)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:31)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.NoClassDefFoundError: net/bytebuddy/utility/GraalImageCode
        //       at org.mockito.internal.creation.bytebuddy.SubclassInjectionLoader.<init>(SubclassInjectionLoader.java:34)
        //       at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.<init>(SubclassByteBuddyMockMaker.java:33)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:29)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.ClassNotFoundException: net.bytebuddy.utility.GraalImageCode
        //       at org.mockito.internal.creation.bytebuddy.SubclassInjectionLoader.<init>(SubclassInjectionLoader.java:34)
        //       at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.<init>(SubclassByteBuddyMockMaker.java:33)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:29)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   See https://diff.blue/R026 to resolve this issue.

        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/okta/deleteOktaUser")
                .param("id", "foo");
        MockMvcBuilders.standaloneSetup(oktaServiceController).build().perform(requestBuilder);
    }

    /**
     * Method under test: {@link OktaServiceController#getRecoveryQuestion(Question, OktaUsers, Model)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetRecoveryQuestion() throws Exception {
        // TODO: Complete this test.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: Failed to load ApplicationContext
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
        //       at java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:1002)
        //       at java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)
        //       at java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:647)
        //   java.lang.IllegalStateException: Could not initialize plugin: interface org.mockito.plugins.MockMaker (alternate: null)
        //       at org.mockito.internal.configuration.plugins.PluginLoader$1.invoke(PluginLoader.java:84)
        //       at jdk.proxy3.$Proxy21.isTypeMockable(null)
        //       at org.mockito.internal.util.MockUtil.typeMockabilityOf(MockUtil.java:78)
        //       at org.mockito.internal.util.MockCreationValidator.validateType(MockCreationValidator.java:22)
        //       at org.mockito.internal.creation.MockSettingsImpl.validatedSettings(MockSettingsImpl.java:267)
        //       at org.mockito.internal.creation.MockSettingsImpl.build(MockSettingsImpl.java:234)
        //       at org.mockito.internal.MockitoCore.mock(MockitoCore.java:86)
        //       at org.mockito.Mockito.mock(Mockito.java:2037)
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
        //       at java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:1002)
        //       at java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)
        //       at java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:647)
        //   java.lang.IllegalStateException: Internal problem occurred, please report it. Mockito is unable to load the default implementation of class that is a part of Mockito distribution. Failed to load interface org.mockito.plugins.MockMaker
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:97)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.reflect.InvocationTargetException
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   org.mockito.exceptions.base.MockitoInitializationException:
        //   It seems like you are running Mockito with an incomplete or inconsistent class path. Byte Buddy could not be loaded.
        //   Byte Buddy is available on Maven Central as 'net.bytebuddy:byte-buddy' with the module name 'net.bytebuddy'.
        //   For the inline mock maker, 'net.bytebuddy:byte-buddy-agent' with the module name 'net.bytebuddy.agent' is also required.
        //   Normally, your IDE or build tool (such as Maven or Gradle) should take care of your class path completion but
        //       at org.mockito.internal.exceptions.Reporter.missingByteBuddyDependency(Reporter.java:1131)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:31)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.NoClassDefFoundError: net/bytebuddy/utility/GraalImageCode
        //       at org.mockito.internal.creation.bytebuddy.SubclassInjectionLoader.<init>(SubclassInjectionLoader.java:34)
        //       at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.<init>(SubclassByteBuddyMockMaker.java:33)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:29)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.ClassNotFoundException: net.bytebuddy.utility.GraalImageCode
        //       at org.mockito.internal.creation.bytebuddy.SubclassInjectionLoader.<init>(SubclassInjectionLoader.java:34)
        //       at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.<init>(SubclassByteBuddyMockMaker.java:33)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:29)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   See https://diff.blue/R026 to resolve this issue.

        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/okta/recoveryQuestion");
        MockMvcBuilders.standaloneSetup(oktaServiceController).build().perform(requestBuilder);
    }

    /**
     * Method under test: {@link OktaServiceController#saveAuthentication(OktaUsers)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSaveAuthentication() throws Exception {
        // TODO: Complete this test.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: Failed to load ApplicationContext
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
        //       at java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:1002)
        //       at java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)
        //       at java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:647)
        //   java.lang.IllegalStateException: Could not initialize plugin: interface org.mockito.plugins.MockMaker (alternate: null)
        //       at org.mockito.internal.configuration.plugins.PluginLoader$1.invoke(PluginLoader.java:84)
        //       at jdk.proxy3.$Proxy21.isTypeMockable(null)
        //       at org.mockito.internal.util.MockUtil.typeMockabilityOf(MockUtil.java:78)
        //       at org.mockito.internal.util.MockCreationValidator.validateType(MockCreationValidator.java:22)
        //       at org.mockito.internal.creation.MockSettingsImpl.validatedSettings(MockSettingsImpl.java:267)
        //       at org.mockito.internal.creation.MockSettingsImpl.build(MockSettingsImpl.java:234)
        //       at org.mockito.internal.MockitoCore.mock(MockitoCore.java:86)
        //       at org.mockito.Mockito.mock(Mockito.java:2037)
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
        //       at java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:1002)
        //       at java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)
        //       at java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:647)
        //   java.lang.IllegalStateException: Internal problem occurred, please report it. Mockito is unable to load the default implementation of class that is a part of Mockito distribution. Failed to load interface org.mockito.plugins.MockMaker
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:97)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.reflect.InvocationTargetException
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   org.mockito.exceptions.base.MockitoInitializationException:
        //   It seems like you are running Mockito with an incomplete or inconsistent class path. Byte Buddy could not be loaded.
        //   Byte Buddy is available on Maven Central as 'net.bytebuddy:byte-buddy' with the module name 'net.bytebuddy'.
        //   For the inline mock maker, 'net.bytebuddy:byte-buddy-agent' with the module name 'net.bytebuddy.agent' is also required.
        //   Normally, your IDE or build tool (such as Maven or Gradle) should take care of your class path completion but
        //       at org.mockito.internal.exceptions.Reporter.missingByteBuddyDependency(Reporter.java:1131)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:31)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.NoClassDefFoundError: net/bytebuddy/utility/GraalImageCode
        //       at org.mockito.internal.creation.bytebuddy.SubclassInjectionLoader.<init>(SubclassInjectionLoader.java:34)
        //       at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.<init>(SubclassByteBuddyMockMaker.java:33)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:29)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.ClassNotFoundException: net.bytebuddy.utility.GraalImageCode
        //       at org.mockito.internal.creation.bytebuddy.SubclassInjectionLoader.<init>(SubclassInjectionLoader.java:34)
        //       at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.<init>(SubclassByteBuddyMockMaker.java:33)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:29)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   See https://diff.blue/R026 to resolve this issue.

        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/okta/saveAuthentication");
        MockMvcBuilders.standaloneSetup(oktaServiceController).build().perform(requestBuilder);
    }

    /**
     * Method under test: {@link OktaServiceController#saveForgetPasswordWithSecurityAnswer(Credentials, OktaUsers)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSaveForgetPasswordWithSecurityAnswer() throws Exception {
        // TODO: Complete this test.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: Failed to load ApplicationContext
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
        //       at java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:1002)
        //       at java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)
        //       at java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:647)
        //   java.lang.IllegalStateException: Could not initialize plugin: interface org.mockito.plugins.MockMaker (alternate: null)
        //       at org.mockito.internal.configuration.plugins.PluginLoader$1.invoke(PluginLoader.java:84)
        //       at jdk.proxy3.$Proxy21.isTypeMockable(null)
        //       at org.mockito.internal.util.MockUtil.typeMockabilityOf(MockUtil.java:78)
        //       at org.mockito.internal.util.MockCreationValidator.validateType(MockCreationValidator.java:22)
        //       at org.mockito.internal.creation.MockSettingsImpl.validatedSettings(MockSettingsImpl.java:267)
        //       at org.mockito.internal.creation.MockSettingsImpl.build(MockSettingsImpl.java:234)
        //       at org.mockito.internal.MockitoCore.mock(MockitoCore.java:86)
        //       at org.mockito.Mockito.mock(Mockito.java:2037)
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
        //       at java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:1002)
        //       at java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)
        //       at java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:647)
        //   java.lang.IllegalStateException: Internal problem occurred, please report it. Mockito is unable to load the default implementation of class that is a part of Mockito distribution. Failed to load interface org.mockito.plugins.MockMaker
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:97)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.reflect.InvocationTargetException
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   org.mockito.exceptions.base.MockitoInitializationException:
        //   It seems like you are running Mockito with an incomplete or inconsistent class path. Byte Buddy could not be loaded.
        //   Byte Buddy is available on Maven Central as 'net.bytebuddy:byte-buddy' with the module name 'net.bytebuddy'.
        //   For the inline mock maker, 'net.bytebuddy:byte-buddy-agent' with the module name 'net.bytebuddy.agent' is also required.
        //   Normally, your IDE or build tool (such as Maven or Gradle) should take care of your class path completion but
        //       at org.mockito.internal.exceptions.Reporter.missingByteBuddyDependency(Reporter.java:1131)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:31)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.NoClassDefFoundError: net/bytebuddy/utility/GraalImageCode
        //       at org.mockito.internal.creation.bytebuddy.SubclassInjectionLoader.<init>(SubclassInjectionLoader.java:34)
        //       at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.<init>(SubclassByteBuddyMockMaker.java:33)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:29)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.ClassNotFoundException: net.bytebuddy.utility.GraalImageCode
        //       at org.mockito.internal.creation.bytebuddy.SubclassInjectionLoader.<init>(SubclassInjectionLoader.java:34)
        //       at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.<init>(SubclassByteBuddyMockMaker.java:33)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:29)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   See https://diff.blue/R026 to resolve this issue.

        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders
                .post("/okta/saveForgetPasswordWithSecurityAnswer");
        MockMvcBuilders.standaloneSetup(oktaServiceController).build().perform(requestBuilder);
    }

    /**
     * Method under test: {@link OktaServiceController#saveOktaUser(Profile, BindingResult)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSaveOktaUser() throws Exception {
        // TODO: Complete this test.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: Failed to load ApplicationContext
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
        //       at java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:1002)
        //       at java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)
        //       at java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:647)
        //   java.lang.IllegalStateException: Could not initialize plugin: interface org.mockito.plugins.MockMaker (alternate: null)
        //       at org.mockito.internal.configuration.plugins.PluginLoader$1.invoke(PluginLoader.java:84)
        //       at jdk.proxy3.$Proxy21.isTypeMockable(null)
        //       at org.mockito.internal.util.MockUtil.typeMockabilityOf(MockUtil.java:78)
        //       at org.mockito.internal.util.MockCreationValidator.validateType(MockCreationValidator.java:22)
        //       at org.mockito.internal.creation.MockSettingsImpl.validatedSettings(MockSettingsImpl.java:267)
        //       at org.mockito.internal.creation.MockSettingsImpl.build(MockSettingsImpl.java:234)
        //       at org.mockito.internal.MockitoCore.mock(MockitoCore.java:86)
        //       at org.mockito.Mockito.mock(Mockito.java:2037)
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
        //       at java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:1002)
        //       at java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)
        //       at java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:647)
        //   java.lang.IllegalStateException: Internal problem occurred, please report it. Mockito is unable to load the default implementation of class that is a part of Mockito distribution. Failed to load interface org.mockito.plugins.MockMaker
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:97)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.reflect.InvocationTargetException
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   org.mockito.exceptions.base.MockitoInitializationException:
        //   It seems like you are running Mockito with an incomplete or inconsistent class path. Byte Buddy could not be loaded.
        //   Byte Buddy is available on Maven Central as 'net.bytebuddy:byte-buddy' with the module name 'net.bytebuddy'.
        //   For the inline mock maker, 'net.bytebuddy:byte-buddy-agent' with the module name 'net.bytebuddy.agent' is also required.
        //   Normally, your IDE or build tool (such as Maven or Gradle) should take care of your class path completion but
        //       at org.mockito.internal.exceptions.Reporter.missingByteBuddyDependency(Reporter.java:1131)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:31)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.NoClassDefFoundError: net/bytebuddy/utility/GraalImageCode
        //       at org.mockito.internal.creation.bytebuddy.SubclassInjectionLoader.<init>(SubclassInjectionLoader.java:34)
        //       at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.<init>(SubclassByteBuddyMockMaker.java:33)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:29)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.ClassNotFoundException: net.bytebuddy.utility.GraalImageCode
        //       at org.mockito.internal.creation.bytebuddy.SubclassInjectionLoader.<init>(SubclassInjectionLoader.java:34)
        //       at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.<init>(SubclassByteBuddyMockMaker.java:33)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:29)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   See https://diff.blue/R026 to resolve this issue.

        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/okta/saveOktaUser");
        MockMvcBuilders.standaloneSetup(oktaServiceController).build().perform(requestBuilder);
    }

    /**
     * Method under test: {@link OktaServiceController#saveOktaUserInGroups(OktaUsers)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSaveOktaUserInGroups() throws Exception {
        // TODO: Complete this test.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: Failed to load ApplicationContext
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
        //       at java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:1002)
        //       at java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)
        //       at java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:647)
        //   java.lang.IllegalStateException: Could not initialize plugin: interface org.mockito.plugins.MockMaker (alternate: null)
        //       at org.mockito.internal.configuration.plugins.PluginLoader$1.invoke(PluginLoader.java:84)
        //       at jdk.proxy3.$Proxy21.isTypeMockable(null)
        //       at org.mockito.internal.util.MockUtil.typeMockabilityOf(MockUtil.java:78)
        //       at org.mockito.internal.util.MockCreationValidator.validateType(MockCreationValidator.java:22)
        //       at org.mockito.internal.creation.MockSettingsImpl.validatedSettings(MockSettingsImpl.java:267)
        //       at org.mockito.internal.creation.MockSettingsImpl.build(MockSettingsImpl.java:234)
        //       at org.mockito.internal.MockitoCore.mock(MockitoCore.java:86)
        //       at org.mockito.Mockito.mock(Mockito.java:2037)
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
        //       at java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:1002)
        //       at java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)
        //       at java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:647)
        //   java.lang.IllegalStateException: Internal problem occurred, please report it. Mockito is unable to load the default implementation of class that is a part of Mockito distribution. Failed to load interface org.mockito.plugins.MockMaker
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:97)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.reflect.InvocationTargetException
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   org.mockito.exceptions.base.MockitoInitializationException:
        //   It seems like you are running Mockito with an incomplete or inconsistent class path. Byte Buddy could not be loaded.
        //   Byte Buddy is available on Maven Central as 'net.bytebuddy:byte-buddy' with the module name 'net.bytebuddy'.
        //   For the inline mock maker, 'net.bytebuddy:byte-buddy-agent' with the module name 'net.bytebuddy.agent' is also required.
        //   Normally, your IDE or build tool (such as Maven or Gradle) should take care of your class path completion but
        //       at org.mockito.internal.exceptions.Reporter.missingByteBuddyDependency(Reporter.java:1131)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:31)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.NoClassDefFoundError: net/bytebuddy/utility/GraalImageCode
        //       at org.mockito.internal.creation.bytebuddy.SubclassInjectionLoader.<init>(SubclassInjectionLoader.java:34)
        //       at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.<init>(SubclassByteBuddyMockMaker.java:33)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:29)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.ClassNotFoundException: net.bytebuddy.utility.GraalImageCode
        //       at org.mockito.internal.creation.bytebuddy.SubclassInjectionLoader.<init>(SubclassInjectionLoader.java:34)
        //       at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.<init>(SubclassByteBuddyMockMaker.java:33)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:29)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   See https://diff.blue/R026 to resolve this issue.

        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/okta/saveOktaUserFormInGroups");
        MockMvcBuilders.standaloneSetup(oktaServiceController).build().perform(requestBuilder);
    }

    /**
     * Method under test: {@link OktaServiceController#saveOktaUserWithPassword(OktaUsers)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSaveOktaUserWithPassword() throws Exception {
        // TODO: Complete this test.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: Failed to load ApplicationContext
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
        //       at java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:1002)
        //       at java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)
        //       at java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:647)
        //   java.lang.IllegalStateException: Could not initialize plugin: interface org.mockito.plugins.MockMaker (alternate: null)
        //       at org.mockito.internal.configuration.plugins.PluginLoader$1.invoke(PluginLoader.java:84)
        //       at jdk.proxy3.$Proxy21.isTypeMockable(null)
        //       at org.mockito.internal.util.MockUtil.typeMockabilityOf(MockUtil.java:78)
        //       at org.mockito.internal.util.MockCreationValidator.validateType(MockCreationValidator.java:22)
        //       at org.mockito.internal.creation.MockSettingsImpl.validatedSettings(MockSettingsImpl.java:267)
        //       at org.mockito.internal.creation.MockSettingsImpl.build(MockSettingsImpl.java:234)
        //       at org.mockito.internal.MockitoCore.mock(MockitoCore.java:86)
        //       at org.mockito.Mockito.mock(Mockito.java:2037)
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
        //       at java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:1002)
        //       at java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)
        //       at java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:647)
        //   java.lang.IllegalStateException: Internal problem occurred, please report it. Mockito is unable to load the default implementation of class that is a part of Mockito distribution. Failed to load interface org.mockito.plugins.MockMaker
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:97)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.reflect.InvocationTargetException
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   org.mockito.exceptions.base.MockitoInitializationException:
        //   It seems like you are running Mockito with an incomplete or inconsistent class path. Byte Buddy could not be loaded.
        //   Byte Buddy is available on Maven Central as 'net.bytebuddy:byte-buddy' with the module name 'net.bytebuddy'.
        //   For the inline mock maker, 'net.bytebuddy:byte-buddy-agent' with the module name 'net.bytebuddy.agent' is also required.
        //   Normally, your IDE or build tool (such as Maven or Gradle) should take care of your class path completion but
        //       at org.mockito.internal.exceptions.Reporter.missingByteBuddyDependency(Reporter.java:1131)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:31)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.NoClassDefFoundError: net/bytebuddy/utility/GraalImageCode
        //       at org.mockito.internal.creation.bytebuddy.SubclassInjectionLoader.<init>(SubclassInjectionLoader.java:34)
        //       at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.<init>(SubclassByteBuddyMockMaker.java:33)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:29)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.ClassNotFoundException: net.bytebuddy.utility.GraalImageCode
        //       at org.mockito.internal.creation.bytebuddy.SubclassInjectionLoader.<init>(SubclassInjectionLoader.java:34)
        //       at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.<init>(SubclassByteBuddyMockMaker.java:33)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:29)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   See https://diff.blue/R026 to resolve this issue.

        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/okta/saveOktaUserWithPassword");
        MockMvcBuilders.standaloneSetup(oktaServiceController).build().perform(requestBuilder);
    }

    /**
     * Method under test: {@link OktaServiceController#saveOktaUserWithRecovery(OktaUsers)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSaveOktaUserWithRecovery() throws Exception {
        // TODO: Complete this test.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: Failed to load ApplicationContext
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
        //       at java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:1002)
        //       at java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)
        //       at java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:647)
        //   java.lang.IllegalStateException: Could not initialize plugin: interface org.mockito.plugins.MockMaker (alternate: null)
        //       at org.mockito.internal.configuration.plugins.PluginLoader$1.invoke(PluginLoader.java:84)
        //       at jdk.proxy3.$Proxy21.isTypeMockable(null)
        //       at org.mockito.internal.util.MockUtil.typeMockabilityOf(MockUtil.java:78)
        //       at org.mockito.internal.util.MockCreationValidator.validateType(MockCreationValidator.java:22)
        //       at org.mockito.internal.creation.MockSettingsImpl.validatedSettings(MockSettingsImpl.java:267)
        //       at org.mockito.internal.creation.MockSettingsImpl.build(MockSettingsImpl.java:234)
        //       at org.mockito.internal.MockitoCore.mock(MockitoCore.java:86)
        //       at org.mockito.Mockito.mock(Mockito.java:2037)
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
        //       at java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:1002)
        //       at java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)
        //       at java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:647)
        //   java.lang.IllegalStateException: Internal problem occurred, please report it. Mockito is unable to load the default implementation of class that is a part of Mockito distribution. Failed to load interface org.mockito.plugins.MockMaker
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:97)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.reflect.InvocationTargetException
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   org.mockito.exceptions.base.MockitoInitializationException:
        //   It seems like you are running Mockito with an incomplete or inconsistent class path. Byte Buddy could not be loaded.
        //   Byte Buddy is available on Maven Central as 'net.bytebuddy:byte-buddy' with the module name 'net.bytebuddy'.
        //   For the inline mock maker, 'net.bytebuddy:byte-buddy-agent' with the module name 'net.bytebuddy.agent' is also required.
        //   Normally, your IDE or build tool (such as Maven or Gradle) should take care of your class path completion but
        //       at org.mockito.internal.exceptions.Reporter.missingByteBuddyDependency(Reporter.java:1131)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:31)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.NoClassDefFoundError: net/bytebuddy/utility/GraalImageCode
        //       at org.mockito.internal.creation.bytebuddy.SubclassInjectionLoader.<init>(SubclassInjectionLoader.java:34)
        //       at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.<init>(SubclassByteBuddyMockMaker.java:33)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:29)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.ClassNotFoundException: net.bytebuddy.utility.GraalImageCode
        //       at org.mockito.internal.creation.bytebuddy.SubclassInjectionLoader.<init>(SubclassInjectionLoader.java:34)
        //       at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.<init>(SubclassByteBuddyMockMaker.java:33)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:29)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   See https://diff.blue/R026 to resolve this issue.

        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/okta/saveOktaUserWithRecovery");
        MockMvcBuilders.standaloneSetup(oktaServiceController).build().perform(requestBuilder);
    }

    /**
     * Method under test: {@link OktaServiceController#saveOktaUserWithResetPassword(OktaUsers)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSaveOktaUserWithResetPassword() throws Exception {
        // TODO: Complete this test.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: Failed to load ApplicationContext
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
        //       at java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:1002)
        //       at java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)
        //       at java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:647)
        //   java.lang.IllegalStateException: Could not initialize plugin: interface org.mockito.plugins.MockMaker (alternate: null)
        //       at org.mockito.internal.configuration.plugins.PluginLoader$1.invoke(PluginLoader.java:84)
        //       at jdk.proxy3.$Proxy21.isTypeMockable(null)
        //       at org.mockito.internal.util.MockUtil.typeMockabilityOf(MockUtil.java:78)
        //       at org.mockito.internal.util.MockCreationValidator.validateType(MockCreationValidator.java:22)
        //       at org.mockito.internal.creation.MockSettingsImpl.validatedSettings(MockSettingsImpl.java:267)
        //       at org.mockito.internal.creation.MockSettingsImpl.build(MockSettingsImpl.java:234)
        //       at org.mockito.internal.MockitoCore.mock(MockitoCore.java:86)
        //       at org.mockito.Mockito.mock(Mockito.java:2037)
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
        //       at java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:1002)
        //       at java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)
        //       at java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:647)
        //   java.lang.IllegalStateException: Internal problem occurred, please report it. Mockito is unable to load the default implementation of class that is a part of Mockito distribution. Failed to load interface org.mockito.plugins.MockMaker
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:97)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.reflect.InvocationTargetException
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   org.mockito.exceptions.base.MockitoInitializationException:
        //   It seems like you are running Mockito with an incomplete or inconsistent class path. Byte Buddy could not be loaded.
        //   Byte Buddy is available on Maven Central as 'net.bytebuddy:byte-buddy' with the module name 'net.bytebuddy'.
        //   For the inline mock maker, 'net.bytebuddy:byte-buddy-agent' with the module name 'net.bytebuddy.agent' is also required.
        //   Normally, your IDE or build tool (such as Maven or Gradle) should take care of your class path completion but
        //       at org.mockito.internal.exceptions.Reporter.missingByteBuddyDependency(Reporter.java:1131)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:31)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.NoClassDefFoundError: net/bytebuddy/utility/GraalImageCode
        //       at org.mockito.internal.creation.bytebuddy.SubclassInjectionLoader.<init>(SubclassInjectionLoader.java:34)
        //       at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.<init>(SubclassByteBuddyMockMaker.java:33)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:29)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.ClassNotFoundException: net.bytebuddy.utility.GraalImageCode
        //       at org.mockito.internal.creation.bytebuddy.SubclassInjectionLoader.<init>(SubclassInjectionLoader.java:34)
        //       at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.<init>(SubclassByteBuddyMockMaker.java:33)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:29)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   See https://diff.blue/R026 to resolve this issue.

        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/okta/saveOktaUserWithResetPassword");
        MockMvcBuilders.standaloneSetup(oktaServiceController).build().perform(requestBuilder);
    }

    /**
     * Method under test: {@link OktaServiceController#savePassword(OktaUsers)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSavePassword() throws Exception {
        // TODO: Complete this test.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: Failed to load ApplicationContext
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
        //       at java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:1002)
        //       at java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)
        //       at java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:647)
        //   java.lang.IllegalStateException: Could not initialize plugin: interface org.mockito.plugins.MockMaker (alternate: null)
        //       at org.mockito.internal.configuration.plugins.PluginLoader$1.invoke(PluginLoader.java:84)
        //       at jdk.proxy3.$Proxy21.isTypeMockable(null)
        //       at org.mockito.internal.util.MockUtil.typeMockabilityOf(MockUtil.java:78)
        //       at org.mockito.internal.util.MockCreationValidator.validateType(MockCreationValidator.java:22)
        //       at org.mockito.internal.creation.MockSettingsImpl.validatedSettings(MockSettingsImpl.java:267)
        //       at org.mockito.internal.creation.MockSettingsImpl.build(MockSettingsImpl.java:234)
        //       at org.mockito.internal.MockitoCore.mock(MockitoCore.java:86)
        //       at org.mockito.Mockito.mock(Mockito.java:2037)
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
        //       at java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:1002)
        //       at java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)
        //       at java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:647)
        //   java.lang.IllegalStateException: Internal problem occurred, please report it. Mockito is unable to load the default implementation of class that is a part of Mockito distribution. Failed to load interface org.mockito.plugins.MockMaker
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:97)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.reflect.InvocationTargetException
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   org.mockito.exceptions.base.MockitoInitializationException:
        //   It seems like you are running Mockito with an incomplete or inconsistent class path. Byte Buddy could not be loaded.
        //   Byte Buddy is available on Maven Central as 'net.bytebuddy:byte-buddy' with the module name 'net.bytebuddy'.
        //   For the inline mock maker, 'net.bytebuddy:byte-buddy-agent' with the module name 'net.bytebuddy.agent' is also required.
        //   Normally, your IDE or build tool (such as Maven or Gradle) should take care of your class path completion but
        //       at org.mockito.internal.exceptions.Reporter.missingByteBuddyDependency(Reporter.java:1131)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:31)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.NoClassDefFoundError: net/bytebuddy/utility/GraalImageCode
        //       at org.mockito.internal.creation.bytebuddy.SubclassInjectionLoader.<init>(SubclassInjectionLoader.java:34)
        //       at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.<init>(SubclassByteBuddyMockMaker.java:33)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:29)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.ClassNotFoundException: net.bytebuddy.utility.GraalImageCode
        //       at org.mockito.internal.creation.bytebuddy.SubclassInjectionLoader.<init>(SubclassInjectionLoader.java:34)
        //       at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.<init>(SubclassByteBuddyMockMaker.java:33)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:29)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   See https://diff.blue/R026 to resolve this issue.

        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/okta/savePassword");
        MockMvcBuilders.standaloneSetup(oktaServiceController).build().perform(requestBuilder);
    }

    /**
     * Method under test: {@link OktaServiceController#singleUser(String, Model)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSingleUser() throws Exception {
        // TODO: Complete this test.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: Failed to load ApplicationContext
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
        //       at java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:1002)
        //       at java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)
        //       at java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:647)
        //   java.lang.IllegalStateException: Could not initialize plugin: interface org.mockito.plugins.MockMaker (alternate: null)
        //       at org.mockito.internal.configuration.plugins.PluginLoader$1.invoke(PluginLoader.java:84)
        //       at jdk.proxy3.$Proxy21.isTypeMockable(null)
        //       at org.mockito.internal.util.MockUtil.typeMockabilityOf(MockUtil.java:78)
        //       at org.mockito.internal.util.MockCreationValidator.validateType(MockCreationValidator.java:22)
        //       at org.mockito.internal.creation.MockSettingsImpl.validatedSettings(MockSettingsImpl.java:267)
        //       at org.mockito.internal.creation.MockSettingsImpl.build(MockSettingsImpl.java:234)
        //       at org.mockito.internal.MockitoCore.mock(MockitoCore.java:86)
        //       at org.mockito.Mockito.mock(Mockito.java:2037)
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
        //       at java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:1002)
        //       at java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)
        //       at java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:647)
        //   java.lang.IllegalStateException: Internal problem occurred, please report it. Mockito is unable to load the default implementation of class that is a part of Mockito distribution. Failed to load interface org.mockito.plugins.MockMaker
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:97)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.reflect.InvocationTargetException
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   org.mockito.exceptions.base.MockitoInitializationException:
        //   It seems like you are running Mockito with an incomplete or inconsistent class path. Byte Buddy could not be loaded.
        //   Byte Buddy is available on Maven Central as 'net.bytebuddy:byte-buddy' with the module name 'net.bytebuddy'.
        //   For the inline mock maker, 'net.bytebuddy:byte-buddy-agent' with the module name 'net.bytebuddy.agent' is also required.
        //   Normally, your IDE or build tool (such as Maven or Gradle) should take care of your class path completion but
        //       at org.mockito.internal.exceptions.Reporter.missingByteBuddyDependency(Reporter.java:1131)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:31)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.NoClassDefFoundError: net/bytebuddy/utility/GraalImageCode
        //       at org.mockito.internal.creation.bytebuddy.SubclassInjectionLoader.<init>(SubclassInjectionLoader.java:34)
        //       at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.<init>(SubclassByteBuddyMockMaker.java:33)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:29)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.ClassNotFoundException: net.bytebuddy.utility.GraalImageCode
        //       at org.mockito.internal.creation.bytebuddy.SubclassInjectionLoader.<init>(SubclassInjectionLoader.java:34)
        //       at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.<init>(SubclassByteBuddyMockMaker.java:33)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:29)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   See https://diff.blue/R026 to resolve this issue.

        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/okta/singleUser").param("id", "foo");
        MockMvcBuilders.standaloneSetup(oktaServiceController).build().perform(requestBuilder);
    }

    /**
     * Method under test: {@link OktaServiceController#userList(Model)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUserList() throws Exception {
        // TODO: Complete this test.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: Failed to load ApplicationContext
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
        //       at java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:1002)
        //       at java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)
        //       at java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:647)
        //   java.lang.IllegalStateException: Could not initialize plugin: interface org.mockito.plugins.MockMaker (alternate: null)
        //       at org.mockito.internal.configuration.plugins.PluginLoader$1.invoke(PluginLoader.java:84)
        //       at jdk.proxy3.$Proxy21.isTypeMockable(null)
        //       at org.mockito.internal.util.MockUtil.typeMockabilityOf(MockUtil.java:78)
        //       at org.mockito.internal.util.MockCreationValidator.validateType(MockCreationValidator.java:22)
        //       at org.mockito.internal.creation.MockSettingsImpl.validatedSettings(MockSettingsImpl.java:267)
        //       at org.mockito.internal.creation.MockSettingsImpl.build(MockSettingsImpl.java:234)
        //       at org.mockito.internal.MockitoCore.mock(MockitoCore.java:86)
        //       at org.mockito.Mockito.mock(Mockito.java:2037)
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
        //       at java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:1002)
        //       at java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)
        //       at java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:647)
        //   java.lang.IllegalStateException: Internal problem occurred, please report it. Mockito is unable to load the default implementation of class that is a part of Mockito distribution. Failed to load interface org.mockito.plugins.MockMaker
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:97)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.reflect.InvocationTargetException
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   org.mockito.exceptions.base.MockitoInitializationException:
        //   It seems like you are running Mockito with an incomplete or inconsistent class path. Byte Buddy could not be loaded.
        //   Byte Buddy is available on Maven Central as 'net.bytebuddy:byte-buddy' with the module name 'net.bytebuddy'.
        //   For the inline mock maker, 'net.bytebuddy:byte-buddy-agent' with the module name 'net.bytebuddy.agent' is also required.
        //   Normally, your IDE or build tool (such as Maven or Gradle) should take care of your class path completion but
        //       at org.mockito.internal.exceptions.Reporter.missingByteBuddyDependency(Reporter.java:1131)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:31)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.NoClassDefFoundError: net/bytebuddy/utility/GraalImageCode
        //       at org.mockito.internal.creation.bytebuddy.SubclassInjectionLoader.<init>(SubclassInjectionLoader.java:34)
        //       at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.<init>(SubclassByteBuddyMockMaker.java:33)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:29)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.ClassNotFoundException: net.bytebuddy.utility.GraalImageCode
        //       at org.mockito.internal.creation.bytebuddy.SubclassInjectionLoader.<init>(SubclassInjectionLoader.java:34)
        //       at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.<init>(SubclassByteBuddyMockMaker.java:33)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:29)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   See https://diff.blue/R026 to resolve this issue.

        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/okta/userList");
        MockMvcBuilders.standaloneSetup(oktaServiceController).build().perform(requestBuilder);
    }

    /**
     * Method under test: {@link OktaServiceController#userToken(OktaUsers, Model)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUserToken() throws Exception {
        // TODO: Complete this test.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: Failed to load ApplicationContext
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
        //       at java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:1002)
        //       at java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)
        //       at java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:647)
        //   java.lang.IllegalStateException: Could not initialize plugin: interface org.mockito.plugins.MockMaker (alternate: null)
        //       at org.mockito.internal.configuration.plugins.PluginLoader$1.invoke(PluginLoader.java:84)
        //       at jdk.proxy3.$Proxy21.isTypeMockable(null)
        //       at org.mockito.internal.util.MockUtil.typeMockabilityOf(MockUtil.java:78)
        //       at org.mockito.internal.util.MockCreationValidator.validateType(MockCreationValidator.java:22)
        //       at org.mockito.internal.creation.MockSettingsImpl.validatedSettings(MockSettingsImpl.java:267)
        //       at org.mockito.internal.creation.MockSettingsImpl.build(MockSettingsImpl.java:234)
        //       at org.mockito.internal.MockitoCore.mock(MockitoCore.java:86)
        //       at org.mockito.Mockito.mock(Mockito.java:2037)
        //       at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
        //       at java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:1002)
        //       at java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:129)
        //       at java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:527)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:513)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:647)
        //   java.lang.IllegalStateException: Internal problem occurred, please report it. Mockito is unable to load the default implementation of class that is a part of Mockito distribution. Failed to load interface org.mockito.plugins.MockMaker
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:97)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.reflect.InvocationTargetException
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   org.mockito.exceptions.base.MockitoInitializationException:
        //   It seems like you are running Mockito with an incomplete or inconsistent class path. Byte Buddy could not be loaded.
        //   Byte Buddy is available on Maven Central as 'net.bytebuddy:byte-buddy' with the module name 'net.bytebuddy'.
        //   For the inline mock maker, 'net.bytebuddy:byte-buddy-agent' with the module name 'net.bytebuddy.agent' is also required.
        //   Normally, your IDE or build tool (such as Maven or Gradle) should take care of your class path completion but
        //       at org.mockito.internal.exceptions.Reporter.missingByteBuddyDependency(Reporter.java:1131)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:31)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.NoClassDefFoundError: net/bytebuddy/utility/GraalImageCode
        //       at org.mockito.internal.creation.bytebuddy.SubclassInjectionLoader.<init>(SubclassInjectionLoader.java:34)
        //       at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.<init>(SubclassByteBuddyMockMaker.java:33)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:29)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.ClassNotFoundException: net.bytebuddy.utility.GraalImageCode
        //       at org.mockito.internal.creation.bytebuddy.SubclassInjectionLoader.<init>(SubclassInjectionLoader.java:34)
        //       at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.<init>(SubclassByteBuddyMockMaker.java:33)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:29)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   See https://diff.blue/R026 to resolve this issue.

        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/okta/userToken");
        MockHttpServletRequestBuilder requestBuilder = getResult.param("oktaUsers", String.valueOf(new OktaUsers()));
        MockMvcBuilders.standaloneSetup(oktaServiceController).build().perform(requestBuilder);
    }
}

