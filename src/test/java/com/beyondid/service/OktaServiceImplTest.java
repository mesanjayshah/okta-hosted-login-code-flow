package com.beyondid.service;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.beyondid.data.Credentials;
import com.beyondid.data.OktaUsers;
import com.beyondid.data.Password;
import com.beyondid.data.Profile;
import com.beyondid.data.recoveryQuestion;
import com.beyondid.utils.GlobalException;
import com.beyondid.utils.OktaConfigurationProperties;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@ContextConfiguration(classes = {OktaServiceImpl.class, OktaConfigurationProperties.class})
@ExtendWith(SpringExtension.class)
class OktaServiceImplTest {
    @Autowired
    private OktaConfigurationProperties oktaConfigurationProperties;

    @Autowired
    private OktaServiceImpl oktaServiceImpl;

    @MockBean
    private RestTemplate restTemplate;

    /**
     * Method under test: {@link OktaServiceImpl#getAllOktaUsers()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetAllOktaUsers() {
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

        oktaServiceImpl.getAllOktaUsers();
    }

    /**
     * Method under test: {@link OktaServiceImpl#getAllOktaUsers()}
     */
    @Test
    void testGetAllOktaUsers2() throws RestClientException {
        when(restTemplate.exchange((String) any(), (HttpMethod) any(), (HttpEntity<Object>) any(),
                (ParameterizedTypeReference<Object>) any(), (Object[]) any()))
                .thenReturn(new ResponseEntity<>(HttpStatus.CONTINUE));
        assertNull(oktaServiceImpl.getAllOktaUsers());
        verify(restTemplate).exchange((String) any(), (HttpMethod) any(), (HttpEntity<Object>) any(),
                (ParameterizedTypeReference<Object>) any(), (Object[]) any());
    }

    /**
     * Method under test: {@link OktaServiceImpl#getAllOktaUsers()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetAllOktaUsers3() throws RestClientException {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "org.springframework.http.ResponseEntity.getBody()" because "responseEntity" is null
        //       at com.beyondid.service.OktaServiceImpl.getAllOktaUsers(OktaServiceImpl.java:39)
        //   See https://diff.blue/R013 to resolve this issue.

        when(restTemplate.exchange((String) any(), (HttpMethod) any(), (HttpEntity<Object>) any(),
                (ParameterizedTypeReference<Object>) any(), (Object[]) any())).thenReturn(null);
        oktaServiceImpl.getAllOktaUsers();
    }

    /**
     * Method under test: {@link OktaServiceImpl#getAllOktaUsers()}
     */
    @Test
    void testGetAllOktaUsers4() throws RestClientException {
        when(restTemplate.exchange((String) any(), (HttpMethod) any(), (HttpEntity<Object>) any(),
                (ParameterizedTypeReference<Object>) any(), (Object[]) any()))
                .thenThrow(new GlobalException("An error occurred", new Throwable()));
        assertThrows(GlobalException.class, () -> oktaServiceImpl.getAllOktaUsers());
        verify(restTemplate).exchange((String) any(), (HttpMethod) any(), (HttpEntity<Object>) any(),
                (ParameterizedTypeReference<Object>) any(), (Object[]) any());
    }

    /**
     * Method under test: {@link OktaServiceImpl#getSingleUser(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetSingleUser() {
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

        oktaServiceImpl.getSingleUser("Userid");
    }

    /**
     * Method under test: {@link OktaServiceImpl#getSingleUser(String)}
     */
    @Test
    void testGetSingleUser2() throws RestClientException {
        when(restTemplate.exchange((String) any(), (HttpMethod) any(), (HttpEntity<Object>) any(),
                (ParameterizedTypeReference<Object>) any(), (Object[]) any()))
                .thenReturn(new ResponseEntity<>(HttpStatus.CONTINUE));
        assertNull(oktaServiceImpl.getSingleUser("Userid"));
        verify(restTemplate).exchange((String) any(), (HttpMethod) any(), (HttpEntity<Object>) any(),
                (ParameterizedTypeReference<Object>) any(), (Object[]) any());
    }

    /**
     * Method under test: {@link OktaServiceImpl#getSingleUser(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetSingleUser3() throws RestClientException {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "org.springframework.http.ResponseEntity.getBody()" because "responseEntity" is null
        //       at com.beyondid.service.OktaServiceImpl.getSingleUser(OktaServiceImpl.java:53)
        //   See https://diff.blue/R013 to resolve this issue.

        when(restTemplate.exchange((String) any(), (HttpMethod) any(), (HttpEntity<Object>) any(),
                (ParameterizedTypeReference<Object>) any(), (Object[]) any())).thenReturn(null);
        oktaServiceImpl.getSingleUser("Userid");
    }

    /**
     * Method under test: {@link OktaServiceImpl#saveOktaUser(Profile)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSaveOktaUser() throws GlobalException {
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

        Profile profile = new Profile("Jane", "Doe", "4105551212", "jane.doe@example.org", "Login",
                "jane.doe@example.org", true);

        oktaServiceImpl.saveOktaUser(profile);
    }

    /**
     * Method under test: {@link OktaServiceImpl#saveOktaUser(Profile)}
     */
    @Test
    void testSaveOktaUser2() throws GlobalException, RestClientException {
        when(restTemplate.exchange((String) any(), (HttpMethod) any(), (HttpEntity<Object>) any(),
                (ParameterizedTypeReference<Object>) any(), (Object[]) any()))
                .thenReturn(new ResponseEntity<>(HttpStatus.CONTINUE));
        assertThrows(GlobalException.class, () -> oktaServiceImpl.saveOktaUser(
                new Profile("Jane", "Doe", "4105551212", "jane.doe@example.org", "Login", "jane.doe@example.org", true)));
        verify(restTemplate).exchange((String) any(), (HttpMethod) any(), (HttpEntity<Object>) any(),
                (ParameterizedTypeReference<Object>) any(), (Object[]) any());
    }

    /**
     * Method under test: {@link OktaServiceImpl#saveOktaUser(Profile)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSaveOktaUser3() throws GlobalException, RestClientException {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "org.springframework.http.ResponseEntity.getBody()" because "responseEntity" is null
        //       at com.beyondid.service.OktaServiceImpl.saveOktaUser(OktaServiceImpl.java:88)
        //   See https://diff.blue/R013 to resolve this issue.

        when(restTemplate.exchange((String) any(), (HttpMethod) any(), (HttpEntity<Object>) any(),
                (ParameterizedTypeReference<Object>) any(), (Object[]) any())).thenReturn(null);
        oktaServiceImpl.saveOktaUser(
                new Profile("Jane", "Doe", "4105551212", "jane.doe@example.org", "Login", "jane.doe@example.org", true));
    }

    /**
     * Method under test: {@link OktaServiceImpl#saveOktaUser(Profile)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSaveOktaUser4() throws GlobalException, RestClientException {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.beyondid.data.Profile.getEmail()" because "profile" is null
        //       at com.beyondid.service.OktaServiceImpl.saveOktaUser(OktaServiceImpl.java:59)
        //   See https://diff.blue/R013 to resolve this issue.

        when(restTemplate.exchange((String) any(), (HttpMethod) any(), (HttpEntity<Object>) any(),
                (ParameterizedTypeReference<Object>) any(), (Object[]) any()))
                .thenReturn(new ResponseEntity<>(HttpStatus.CONTINUE));
        oktaServiceImpl.saveOktaUser(null);
    }

    /**
     * Method under test: {@link OktaServiceImpl#saveOktaUser(Profile)}
     */
    @Test
    void testSaveOktaUser5() throws GlobalException, RestClientException {
        when(restTemplate.exchange((String) any(), (HttpMethod) any(), (HttpEntity<Object>) any(),
                (ParameterizedTypeReference<Object>) any(), (Object[]) any()))
                .thenThrow(new GlobalException("An error occurred", new Throwable()));
        assertThrows(GlobalException.class, () -> oktaServiceImpl.saveOktaUser(
                new Profile("Jane", "Doe", "4105551212", "jane.doe@example.org", "Login", "jane.doe@example.org", true)));
        verify(restTemplate).exchange((String) any(), (HttpMethod) any(), (HttpEntity<Object>) any(),
                (ParameterizedTypeReference<Object>) any(), (Object[]) any());
    }

    /**
     * Method under test: {@link OktaServiceImpl#saveOktaUser(Profile)}
     */
    @Test
    void testSaveOktaUser6() throws GlobalException, RestClientException {
        when(restTemplate.exchange((String) any(), (HttpMethod) any(), (HttpEntity<Object>) any(),
                (ParameterizedTypeReference<Object>) any(), (Object[]) any()))
                .thenThrow(new HttpClientErrorException(HttpStatus.CONTINUE));
        assertThrows(HttpClientErrorException.class, () -> oktaServiceImpl.saveOktaUser(
                new Profile("Jane", "Doe", "4105551212", "jane.doe@example.org", "Login", "jane.doe@example.org", true)));
        verify(restTemplate, atLeast(1)).exchange((String) any(), (HttpMethod) any(), (HttpEntity<Object>) any(),
                (ParameterizedTypeReference<Object>) any(), (Object[]) any());
    }

    /**
     * Method under test: {@link OktaServiceImpl#saveOktaUser(Profile)}
     */
    @Test
    void testSaveOktaUser7() throws GlobalException, RestClientException {
        when(restTemplate.exchange((String) any(), (HttpMethod) any(), (HttpEntity<Object>) any(),
                (ParameterizedTypeReference<Object>) any(), (Object[]) any()))
                .thenThrow(new HttpClientErrorException(HttpStatus.CONTINUE));
        assertThrows(HttpClientErrorException.class, () -> oktaServiceImpl.saveOktaUser(new Profile("api/v1/users/",
                "Doe", "4105551212", "jane.doe@example.org", "Login", "jane.doe@example.org", true)));
        verify(restTemplate, atLeast(1)).exchange((String) any(), (HttpMethod) any(), (HttpEntity<Object>) any(),
                (ParameterizedTypeReference<Object>) any(), (Object[]) any());
    }

    /**
     * Method under test: {@link OktaServiceImpl#saveOktaUser(Profile)}
     */
    @Test
    void testSaveOktaUser8() throws GlobalException, RestClientException {
        when(restTemplate.exchange((String) any(), (HttpMethod) any(), (HttpEntity<Object>) any(),
                (ParameterizedTypeReference<Object>) any(), (Object[]) any()))
                .thenThrow(new HttpClientErrorException(HttpStatus.CONTINUE));
        assertThrows(HttpClientErrorException.class, () -> oktaServiceImpl.saveOktaUser(
                new Profile(null, "Doe", "4105551212", "jane.doe@example.org", "Login", "jane.doe@example.org", true)));
        verify(restTemplate, atLeast(1)).exchange((String) any(), (HttpMethod) any(), (HttpEntity<Object>) any(),
                (ParameterizedTypeReference<Object>) any(), (Object[]) any());
    }

    /**
     * Method under test: {@link OktaServiceImpl#activateOktaUser(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testActivateOktaUser() {
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

        oktaServiceImpl.activateOktaUser("42");
    }

    /**
     * Method under test: {@link OktaServiceImpl#activateOktaUser(String)}
     */
    @Test
    void testActivateOktaUser2() throws RestClientException {
        when(restTemplate.exchange((String) any(), (HttpMethod) any(), (HttpEntity<Object>) any(), (Class<Object>) any(),
                (Object[]) any())).thenReturn(new ResponseEntity<>(HttpStatus.CONTINUE));
        oktaServiceImpl.activateOktaUser("42");
        verify(restTemplate).exchange((String) any(), (HttpMethod) any(), (HttpEntity<Object>) any(),
                (Class<Object>) any(), (Object[]) any());
    }

    /**
     * Method under test: {@link OktaServiceImpl#activateOktaUser(String)}
     */
    @Test
    void testActivateOktaUser3() throws RestClientException {
        when(restTemplate.exchange((String) any(), (HttpMethod) any(), (HttpEntity<Object>) any(), (Class<Object>) any(),
                (Object[]) any())).thenThrow(new GlobalException("An error occurred", new Throwable()));
        assertThrows(GlobalException.class, () -> oktaServiceImpl.activateOktaUser("42"));
        verify(restTemplate).exchange((String) any(), (HttpMethod) any(), (HttpEntity<Object>) any(),
                (Class<Object>) any(), (Object[]) any());
    }

    /**
     * Method under test: {@link OktaServiceImpl#deactivateOktaUser(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDeactivateOktaUser() {
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

        oktaServiceImpl.deactivateOktaUser("42");
    }

    /**
     * Method under test: {@link OktaServiceImpl#deactivateOktaUser(String)}
     */
    @Test
    void testDeactivateOktaUser2() throws RestClientException {
        when(restTemplate.exchange((String) any(), (HttpMethod) any(), (HttpEntity<Object>) any(), (Class<Object>) any(),
                (Object[]) any())).thenReturn(new ResponseEntity<>(HttpStatus.CONTINUE));
        oktaServiceImpl.deactivateOktaUser("42");
        verify(restTemplate).exchange((String) any(), (HttpMethod) any(), (HttpEntity<Object>) any(),
                (Class<Object>) any(), (Object[]) any());
    }

    /**
     * Method under test: {@link OktaServiceImpl#deactivateOktaUser(String)}
     */
    @Test
    void testDeactivateOktaUser3() throws RestClientException {
        when(restTemplate.exchange((String) any(), (HttpMethod) any(), (HttpEntity<Object>) any(), (Class<Object>) any(),
                (Object[]) any())).thenThrow(new GlobalException("An error occurred", new Throwable()));
        assertThrows(GlobalException.class, () -> oktaServiceImpl.deactivateOktaUser("42"));
        verify(restTemplate).exchange((String) any(), (HttpMethod) any(), (HttpEntity<Object>) any(),
                (Class<Object>) any(), (Object[]) any());
    }

    /**
     * Method under test: {@link OktaServiceImpl#deleteOktaUser(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDeleteOktaUser() {
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

        oktaServiceImpl.deleteOktaUser("42");
    }

    /**
     * Method under test: {@link OktaServiceImpl#deleteOktaUser(String)}
     */
    @Test
    void testDeleteOktaUser2() throws RestClientException {
        when(restTemplate.exchange((String) any(), (HttpMethod) any(), (HttpEntity<Object>) any(), (Class<Object>) any(),
                (Object[]) any())).thenReturn(new ResponseEntity<>(HttpStatus.CONTINUE));
        oktaServiceImpl.deleteOktaUser("42");
        verify(restTemplate).exchange((String) any(), (HttpMethod) any(), (HttpEntity<Object>) any(),
                (Class<Object>) any(), (Object[]) any());
    }

    /**
     * Method under test: {@link OktaServiceImpl#deleteOktaUser(String)}
     */
    @Test
    void testDeleteOktaUser3() throws RestClientException {
        when(restTemplate.exchange((String) any(), (HttpMethod) any(), (HttpEntity<Object>) any(), (Class<Object>) any(),
                (Object[]) any())).thenThrow(new GlobalException("An error occurred", new Throwable()));
        assertThrows(GlobalException.class, () -> oktaServiceImpl.deleteOktaUser("42"));
        verify(restTemplate).exchange((String) any(), (HttpMethod) any(), (HttpEntity<Object>) any(),
                (Class<Object>) any(), (Object[]) any());
    }

    /**
     * Method under test: {@link OktaServiceImpl#saveForgetPassword(OktaUsers)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSaveForgetPassword() {
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

        OktaUsers oktaUsers = new OktaUsers("janedoe", "iloveyou");

        oktaServiceImpl.saveForgetPassword(oktaUsers);
    }

    /**
     * Method under test: {@link OktaServiceImpl#saveForgetPassword(OktaUsers)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSaveForgetPassword2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.beyondid.data.Credentials.getPassword()" because the return value of "com.beyondid.data.OktaUsers.getCredentials()" is null
        //       at com.beyondid.service.OktaServiceImpl.saveForgetPassword(OktaServiceImpl.java:159)
        //   See https://diff.blue/R013 to resolve this issue.

        oktaServiceImpl.saveForgetPassword(new OktaUsers("janedoe", "iloveyou"));
    }

    /**
     * Method under test: {@link OktaServiceImpl#saveForgetPassword(OktaUsers)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSaveForgetPassword3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.beyondid.data.recoveryQuestion.getAnswer()" because the return value of "com.beyondid.data.Credentials.getRecovery_question()" is null
        //       at com.beyondid.service.OktaServiceImpl.saveForgetPassword(OktaServiceImpl.java:160)
        //   See https://diff.blue/R013 to resolve this issue.

        OktaUsers oktaUsers = new OktaUsers("janedoe", "iloveyou");
        oktaUsers.setCredentials(new Credentials());
        oktaServiceImpl.saveForgetPassword(oktaUsers);
    }

    /**
     * Method under test: {@link OktaServiceImpl#saveForgetPassword(OktaUsers)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSaveForgetPassword4() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.beyondid.data.recoveryQuestion.getAnswer()" because the return value of "com.beyondid.data.Credentials.getRecovery_question()" is null
        //       at com.beyondid.service.OktaServiceImpl.saveForgetPassword(OktaServiceImpl.java:160)
        //   See https://diff.blue/R013 to resolve this issue.

        Credentials credentials = new Credentials();
        credentials.setPassword(new Password("42"));

        OktaUsers oktaUsers = new OktaUsers("janedoe", "iloveyou");
        oktaUsers.setCredentials(credentials);
        oktaServiceImpl.saveForgetPassword(oktaUsers);
    }

    /**
     * Method under test: {@link OktaServiceImpl#saveForgetPassword(OktaUsers)}
     */
    @Test
    void testSaveForgetPassword5() throws RestClientException {
        when(restTemplate.exchange((String) any(), (HttpMethod) any(), (HttpEntity<Object>) any(),
                (ParameterizedTypeReference<Object>) any(), (Object[]) any()))
                .thenReturn(new ResponseEntity<>(HttpStatus.CONTINUE));

        Credentials credentials = new Credentials();
        credentials.setRecovery_question(new recoveryQuestion());

        OktaUsers oktaUsers = new OktaUsers("janedoe", "iloveyou");
        oktaUsers.setCredentials(credentials);
        assertNull(oktaServiceImpl.saveForgetPassword(oktaUsers));
        verify(restTemplate).exchange((String) any(), (HttpMethod) any(), (HttpEntity<Object>) any(),
                (ParameterizedTypeReference<Object>) any(), (Object[]) any());
    }

    /**
     * Method under test: {@link OktaServiceImpl#saveForgetPassword(OktaUsers)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSaveForgetPassword6() throws RestClientException {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "org.springframework.http.ResponseEntity.getBody()" because "responseEntity" is null
        //       at com.beyondid.service.OktaServiceImpl.saveForgetPassword(OktaServiceImpl.java:175)
        //   See https://diff.blue/R013 to resolve this issue.

        when(restTemplate.exchange((String) any(), (HttpMethod) any(), (HttpEntity<Object>) any(),
                (ParameterizedTypeReference<Object>) any(), (Object[]) any())).thenReturn(null);

        Credentials credentials = new Credentials();
        credentials.setRecovery_question(new recoveryQuestion());

        OktaUsers oktaUsers = new OktaUsers("janedoe", "iloveyou");
        oktaUsers.setCredentials(credentials);
        oktaServiceImpl.saveForgetPassword(oktaUsers);
    }

    /**
     * Method under test: {@link OktaServiceImpl#setPassword(OktaUsers)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetPassword() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.beyondid.data.Credentials.getPassword()" because the return value of "com.beyondid.data.OktaUsers.getCredentials()" is null
        //       at com.beyondid.service.OktaServiceImpl.setPassword(OktaServiceImpl.java:186)
        //   See https://diff.blue/R013 to resolve this issue.

        oktaServiceImpl.setPassword(new OktaUsers("janedoe", "iloveyou"));
    }

    /**
     * Method under test: {@link OktaServiceImpl#setPassword(OktaUsers)}
     */
    @Test
    void testSetPassword2() throws RestClientException {
        when(restTemplate.exchange((String) any(), (HttpMethod) any(), (HttpEntity<Object>) any(),
                (ParameterizedTypeReference<Object>) any(), (Object[]) any()))
                .thenReturn(new ResponseEntity<>(HttpStatus.CONTINUE));

        Credentials credentials = new Credentials();
        credentials.setPassword(new Password());

        OktaUsers oktaUsers = new OktaUsers("janedoe", "iloveyou");
        oktaUsers.setCredentials(credentials);
        assertNull(oktaServiceImpl.setPassword(oktaUsers));
        verify(restTemplate).exchange((String) any(), (HttpMethod) any(), (HttpEntity<Object>) any(),
                (ParameterizedTypeReference<Object>) any(), (Object[]) any());
    }

    /**
     * Method under test: {@link OktaServiceImpl#setPassword(OktaUsers)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetPassword3() throws RestClientException {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "org.springframework.http.ResponseEntity.getBody()" because "responseEntity" is null
        //       at com.beyondid.service.OktaServiceImpl.setPassword(OktaServiceImpl.java:199)
        //   See https://diff.blue/R013 to resolve this issue.

        when(restTemplate.exchange((String) any(), (HttpMethod) any(), (HttpEntity<Object>) any(),
                (ParameterizedTypeReference<Object>) any(), (Object[]) any())).thenReturn(null);

        Credentials credentials = new Credentials();
        credentials.setPassword(new Password());

        OktaUsers oktaUsers = new OktaUsers("janedoe", "iloveyou");
        oktaUsers.setCredentials(credentials);
        oktaServiceImpl.setPassword(oktaUsers);
    }

    /**
     * Method under test: {@link OktaServiceImpl#saveOktaUserWithPassword(OktaUsers)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSaveOktaUserWithPassword() {
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

        OktaUsers oktaUsers = new OktaUsers("janedoe", "iloveyou");

        oktaServiceImpl.saveOktaUserWithPassword(oktaUsers);
    }

    /**
     * Method under test: {@link OktaServiceImpl#saveOktaUserWithPassword(OktaUsers)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSaveOktaUserWithPassword2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.beyondid.data.Profile.isVal()" because the return value of "com.beyondid.data.OktaUsers.getProfile()" is null
        //       at com.beyondid.service.OktaServiceImpl.saveOktaUserWithPassword(OktaServiceImpl.java:207)
        //   See https://diff.blue/R013 to resolve this issue.

        oktaServiceImpl.saveOktaUserWithPassword(new OktaUsers("janedoe", "iloveyou"));
    }

    /**
     * Method under test: {@link OktaServiceImpl#saveOktaUserWithPassword(OktaUsers)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSaveOktaUserWithPassword3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.beyondid.data.Credentials.getPassword()" because the return value of "com.beyondid.data.OktaUsers.getCredentials()" is null
        //       at com.beyondid.service.OktaServiceImpl.saveOktaUserWithPassword(OktaServiceImpl.java:216)
        //   See https://diff.blue/R013 to resolve this issue.

        OktaUsers oktaUsers = new OktaUsers("janedoe", "iloveyou");
        oktaUsers.setProfile(new Profile("Jane", "Doe", "4105551212", "jane.doe@example.org", "api/v1/users?activate=",
                "jane.doe@example.org", true));
        oktaServiceImpl.saveOktaUserWithPassword(oktaUsers);
    }

    /**
     * Method under test: {@link OktaServiceImpl#saveOktaUserWithPassword(OktaUsers)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSaveOktaUserWithPassword4() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.beyondid.data.Credentials.getPassword()" because the return value of "com.beyondid.data.OktaUsers.getCredentials()" is null
        //       at com.beyondid.service.OktaServiceImpl.saveOktaUserWithPassword(OktaServiceImpl.java:216)
        //   See https://diff.blue/R013 to resolve this issue.

        OktaUsers oktaUsers = new OktaUsers("janedoe", "iloveyou");
        oktaUsers.setProfile(new Profile());
        oktaServiceImpl.saveOktaUserWithPassword(oktaUsers);
    }

    /**
     * Method under test: {@link OktaServiceImpl#saveOktaUserWithPassword(OktaUsers)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSaveOktaUserWithPassword5() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.beyondid.data.Credentials.getPassword()" because the return value of "com.beyondid.data.OktaUsers.getCredentials()" is null
        //       at com.beyondid.service.OktaServiceImpl.saveOktaUserWithPassword(OktaServiceImpl.java:216)
        //   See https://diff.blue/R013 to resolve this issue.

        Profile profile = mock(Profile.class);
        when(profile.isVal()).thenReturn(true);
        when(profile.getEmail()).thenReturn("jane.doe@example.org");
        when(profile.getFirstName()).thenReturn("Jane");
        when(profile.getLastName()).thenReturn("Doe");
        when(profile.getLogin()).thenReturn("Login");

        OktaUsers oktaUsers = new OktaUsers("janedoe", "iloveyou");
        oktaUsers.setProfile(profile);
        oktaServiceImpl.saveOktaUserWithPassword(oktaUsers);
    }

    /**
     * Method under test: {@link OktaServiceImpl#saveOktaUserWithPassword(OktaUsers)}
     */
    @Test
    void testSaveOktaUserWithPassword6() throws RestClientException {
        when(restTemplate.exchange((String) any(), (HttpMethod) any(), (HttpEntity<Object>) any(),
                (ParameterizedTypeReference<Object>) any(), (Object[]) any()))
                .thenReturn(new ResponseEntity<>(HttpStatus.CONTINUE));
        Profile profile = mock(Profile.class);
        when(profile.isVal()).thenReturn(true);
        when(profile.getEmail()).thenReturn("jane.doe@example.org");
        when(profile.getFirstName()).thenReturn("Jane");
        when(profile.getLastName()).thenReturn("Doe");
        when(profile.getLogin()).thenReturn("Login");

        Credentials credentials = new Credentials();
        credentials.setPassword(new Password());

        OktaUsers oktaUsers = new OktaUsers("janedoe", "iloveyou");
        oktaUsers.setCredentials(credentials);
        oktaUsers.setProfile(profile);
        assertNull(oktaServiceImpl.saveOktaUserWithPassword(oktaUsers));
        verify(restTemplate).exchange((String) any(), (HttpMethod) any(), (HttpEntity<Object>) any(),
                (ParameterizedTypeReference<Object>) any(), (Object[]) any());
        verify(profile).isVal();
        verify(profile).getEmail();
        verify(profile).getFirstName();
        verify(profile).getLastName();
        verify(profile).getLogin();
    }

    /**
     * Method under test: {@link OktaServiceImpl#saveOktaUserWithPassword(OktaUsers)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSaveOktaUserWithPassword7() throws RestClientException {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "org.springframework.http.ResponseEntity.getBody()" because "responseEntity" is null
        //       at com.beyondid.service.OktaServiceImpl.saveOktaUserWithPassword(OktaServiceImpl.java:229)
        //   See https://diff.blue/R013 to resolve this issue.

        when(restTemplate.exchange((String) any(), (HttpMethod) any(), (HttpEntity<Object>) any(),
                (ParameterizedTypeReference<Object>) any(), (Object[]) any())).thenReturn(null);
        Profile profile = mock(Profile.class);
        when(profile.isVal()).thenReturn(true);
        when(profile.getEmail()).thenReturn("jane.doe@example.org");
        when(profile.getFirstName()).thenReturn("Jane");
        when(profile.getLastName()).thenReturn("Doe");
        when(profile.getLogin()).thenReturn("Login");

        Credentials credentials = new Credentials();
        credentials.setPassword(new Password());

        OktaUsers oktaUsers = new OktaUsers("janedoe", "iloveyou");
        oktaUsers.setCredentials(credentials);
        oktaUsers.setProfile(profile);
        oktaServiceImpl.saveOktaUserWithPassword(oktaUsers);
    }

    /**
     * Method under test: {@link OktaServiceImpl#saveOktaUserWithRecovery(OktaUsers)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSaveOktaUserWithRecovery() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.beyondid.data.Profile.isVal()" because the return value of "com.beyondid.data.OktaUsers.getProfile()" is null
        //       at com.beyondid.service.OktaServiceImpl.saveOktaUserWithRecovery(OktaServiceImpl.java:236)
        //   See https://diff.blue/R013 to resolve this issue.

        oktaServiceImpl.saveOktaUserWithRecovery(new OktaUsers("janedoe", "iloveyou"));
    }

    /**
     * Method under test: {@link OktaServiceImpl#saveOktaUserWithRecovery(OktaUsers)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSaveOktaUserWithRecovery2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.beyondid.data.Credentials.getPassword()" because the return value of "com.beyondid.data.OktaUsers.getCredentials()" is null
        //       at com.beyondid.service.OktaServiceImpl.saveOktaUserWithRecovery(OktaServiceImpl.java:249)
        //   See https://diff.blue/R013 to resolve this issue.

        OktaUsers oktaUsers = new OktaUsers("janedoe", "iloveyou");
        oktaUsers.setProfile(new Profile("Jane", "Doe", "4105551212", "jane.doe@example.org", "api/v1/users?activate=",
                "jane.doe@example.org", true));
        oktaServiceImpl.saveOktaUserWithRecovery(oktaUsers);
    }

    /**
     * Method under test: {@link OktaServiceImpl#saveOktaUserWithRecovery(OktaUsers)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSaveOktaUserWithRecovery3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.beyondid.data.Credentials.getPassword()" because the return value of "com.beyondid.data.OktaUsers.getCredentials()" is null
        //       at com.beyondid.service.OktaServiceImpl.saveOktaUserWithRecovery(OktaServiceImpl.java:249)
        //   See https://diff.blue/R013 to resolve this issue.

        OktaUsers oktaUsers = new OktaUsers("janedoe", "iloveyou");
        oktaUsers.setProfile(new Profile());
        oktaServiceImpl.saveOktaUserWithRecovery(oktaUsers);
    }

    /**
     * Method under test: {@link OktaServiceImpl#saveOktaUserWithRecovery(OktaUsers)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSaveOktaUserWithRecovery4() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.beyondid.data.Credentials.getPassword()" because the return value of "com.beyondid.data.OktaUsers.getCredentials()" is null
        //       at com.beyondid.service.OktaServiceImpl.saveOktaUserWithRecovery(OktaServiceImpl.java:249)
        //   See https://diff.blue/R013 to resolve this issue.

        Profile profile = mock(Profile.class);
        when(profile.isVal()).thenReturn(true);
        when(profile.getEmail()).thenReturn("jane.doe@example.org");
        when(profile.getFirstName()).thenReturn("Jane");
        when(profile.getLastName()).thenReturn("Doe");
        when(profile.getLogin()).thenReturn("Login");

        OktaUsers oktaUsers = new OktaUsers("janedoe", "iloveyou");
        oktaUsers.setProfile(profile);
        oktaServiceImpl.saveOktaUserWithRecovery(oktaUsers);
    }

    /**
     * Method under test: {@link OktaServiceImpl#saveOktaUserWithRecovery(OktaUsers)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSaveOktaUserWithRecovery5() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.beyondid.data.Password.getValue()" because the return value of "com.beyondid.data.Credentials.getPassword()" is null
        //       at com.beyondid.service.OktaServiceImpl.saveOktaUserWithRecovery(OktaServiceImpl.java:249)
        //   See https://diff.blue/R013 to resolve this issue.

        Profile profile = mock(Profile.class);
        when(profile.isVal()).thenReturn(true);
        when(profile.getEmail()).thenReturn("jane.doe@example.org");
        when(profile.getFirstName()).thenReturn("Jane");
        when(profile.getLastName()).thenReturn("Doe");
        when(profile.getLogin()).thenReturn("Login");

        OktaUsers oktaUsers = new OktaUsers("janedoe", "iloveyou");
        oktaUsers.setCredentials(new Credentials());
        oktaUsers.setProfile(profile);
        oktaServiceImpl.saveOktaUserWithRecovery(oktaUsers);
    }

    /**
     * Method under test: {@link OktaServiceImpl#savePassword(OktaUsers)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSavePassword() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.beyondid.data.Credentials.getPassword()" because the return value of "com.beyondid.data.OktaUsers.getCredentials()" is null
        //       at com.beyondid.service.OktaServiceImpl.savePassword(OktaServiceImpl.java:285)
        //   See https://diff.blue/R013 to resolve this issue.

        oktaServiceImpl.savePassword(new OktaUsers("janedoe", "iloveyou"));
    }

    /**
     * Method under test: {@link OktaServiceImpl#savePassword(OktaUsers)}
     */
    @Test
    void testSavePassword2() throws RestClientException {
        when(restTemplate.exchange((String) any(), (HttpMethod) any(), (HttpEntity<Object>) any(),
                (ParameterizedTypeReference<Object>) any(), (Object[]) any()))
                .thenReturn(new ResponseEntity<>(HttpStatus.CONTINUE));

        Credentials credentials = new Credentials();
        credentials.setPassword(new Password());

        OktaUsers oktaUsers = new OktaUsers("janedoe", "iloveyou");
        oktaUsers.setCredentials(credentials);
        assertNull(oktaServiceImpl.savePassword(oktaUsers));
        verify(restTemplate).exchange((String) any(), (HttpMethod) any(), (HttpEntity<Object>) any(),
                (ParameterizedTypeReference<Object>) any(), (Object[]) any());
    }

    /**
     * Method under test: {@link OktaServiceImpl#savePassword(OktaUsers)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSavePassword3() throws RestClientException {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "org.springframework.http.ResponseEntity.getBody()" because "responseEntity" is null
        //       at com.beyondid.service.OktaServiceImpl.savePassword(OktaServiceImpl.java:297)
        //   See https://diff.blue/R013 to resolve this issue.

        when(restTemplate.exchange((String) any(), (HttpMethod) any(), (HttpEntity<Object>) any(),
                (ParameterizedTypeReference<Object>) any(), (Object[]) any())).thenReturn(null);

        Credentials credentials = new Credentials();
        credentials.setPassword(new Password());

        OktaUsers oktaUsers = new OktaUsers("janedoe", "iloveyou");
        oktaUsers.setCredentials(credentials);
        oktaServiceImpl.savePassword(oktaUsers);
    }

    /**
     * Method under test: {@link OktaServiceImpl#recoveryQuestion(OktaUsers)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testRecoveryQuestion() {
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

        OktaUsers oktaUsers = new OktaUsers("janedoe", "iloveyou");

        oktaServiceImpl.recoveryQuestion(oktaUsers);
    }

    /**
     * Method under test: {@link OktaServiceImpl#recoveryQuestion(OktaUsers)}
     */
    @Test
    void testRecoveryQuestion2() throws RestClientException {
        when(restTemplate.exchange((String) any(), (HttpMethod) any(), (HttpEntity<Object>) any(), (Class<Object>) any(),
                (Object[]) any())).thenReturn(new ResponseEntity<>(HttpStatus.CONTINUE));
        assertNull(oktaServiceImpl.recoveryQuestion(new OktaUsers("janedoe", "iloveyou")));
        verify(restTemplate).exchange((String) any(), (HttpMethod) any(), (HttpEntity<Object>) any(),
                (Class<Object>) any(), (Object[]) any());
    }

    /**
     * Method under test: {@link OktaServiceImpl#recoveryQuestion(OktaUsers)}
     */
    @Test
    void testRecoveryQuestion3() throws RestClientException {
        when(restTemplate.exchange((String) any(), (HttpMethod) any(), (HttpEntity<Object>) any(), (Class<Object>) any(),
                (Object[]) any())).thenReturn(null);
        assertNull(oktaServiceImpl.recoveryQuestion(new OktaUsers("janedoe", "iloveyou")));
        verify(restTemplate).exchange((String) any(), (HttpMethod) any(), (HttpEntity<Object>) any(),
                (Class<Object>) any(), (Object[]) any());
    }

    /**
     * Method under test: {@link OktaServiceImpl#recoveryQuestion(OktaUsers)}
     */
    @Test
    void testRecoveryQuestion4() throws RestClientException {
        when(restTemplate.exchange((String) any(), (HttpMethod) any(), (HttpEntity<Object>) any(), (Class<Object>) any(),
                (Object[]) any())).thenReturn(new ResponseEntity<>("Body", HttpStatus.CONTINUE));
        assertNull(oktaServiceImpl.recoveryQuestion(new OktaUsers("janedoe", "iloveyou")));
        verify(restTemplate).exchange((String) any(), (HttpMethod) any(), (HttpEntity<Object>) any(),
                (Class<Object>) any(), (Object[]) any());
    }

    /**
     * Method under test: {@link OktaServiceImpl#recoveryQuestion(OktaUsers)}
     */
    @Test
    void testRecoveryQuestion5() throws RestClientException {
        ResponseEntity<Object> responseEntity = (ResponseEntity<Object>) mock(ResponseEntity.class);
        when(responseEntity.getBody()).thenReturn("Body");
        when(restTemplate.exchange((String) any(), (HttpMethod) any(), (HttpEntity<Object>) any(), (Class<Object>) any(),
                (Object[]) any())).thenReturn(responseEntity);
        assertNull(oktaServiceImpl.recoveryQuestion(new OktaUsers("janedoe", "iloveyou")));
        verify(restTemplate).exchange((String) any(), (HttpMethod) any(), (HttpEntity<Object>) any(),
                (Class<Object>) any(), (Object[]) any());
        verify(responseEntity).getBody();
    }

    /**
     * Method under test: {@link OktaServiceImpl#saveOktaUserInGroup(OktaUsers)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSaveOktaUserInGroup() {
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

        OktaUsers oktaUsers = new OktaUsers("janedoe", "iloveyou");

        oktaServiceImpl.saveOktaUserInGroup(oktaUsers);
    }

    /**
     * Method under test: {@link OktaServiceImpl#saveOktaUserInGroup(OktaUsers)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSaveOktaUserInGroup2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.beyondid.data.Profile.getFirstName()" because the return value of "com.beyondid.data.OktaUsers.getProfile()" is null
        //       at com.beyondid.service.OktaServiceImpl.saveOktaUserInGroup(OktaServiceImpl.java:333)
        //   See https://diff.blue/R013 to resolve this issue.

        oktaServiceImpl.saveOktaUserInGroup(new OktaUsers("janedoe", "iloveyou"));
    }

    /**
     * Method under test: {@link OktaServiceImpl#saveOktaUserInGroup(OktaUsers)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSaveOktaUserInGroup3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.beyondid.data.OktaUsers.getProfile()" because "oktaUsers" is null
        //       at com.beyondid.service.OktaServiceImpl.saveOktaUserInGroup(OktaServiceImpl.java:333)
        //   See https://diff.blue/R013 to resolve this issue.

        oktaServiceImpl.saveOktaUserInGroup(null);
    }

    /**
     * Method under test: {@link OktaServiceImpl#saveOktaUserInGroup(OktaUsers)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSaveOktaUserInGroup4() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   com.beyondid.utils.GlobalException: An error occurred
        //       at com.beyondid.service.OktaServiceImpl.saveOktaUserInGroup(OktaServiceImpl.java:333)
        //   java.lang.ArrayIndexOutOfBoundsException
        //   See https://diff.blue/R013 to resolve this issue.

        OktaUsers oktaUsers = mock(OktaUsers.class);
        when(oktaUsers.getProfile())
                .thenThrow(new GlobalException("An error occurred", new ArrayIndexOutOfBoundsException()));
        oktaServiceImpl.saveOktaUserInGroup(oktaUsers);
    }

    /**
     * Method under test: {@link OktaServiceImpl#saveAuthentication(OktaUsers)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSaveAuthentication() {
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

        OktaUsers oktaUsers = new OktaUsers("janedoe", "iloveyou");

        oktaServiceImpl.saveAuthentication(oktaUsers);
    }

    /**
     * Method under test: {@link OktaServiceImpl#saveAuthentication(OktaUsers)}
     */
    @Test
    void testSaveAuthentication2() throws RestClientException {
        when(restTemplate.exchange((String) any(), (HttpMethod) any(), (HttpEntity<Object>) any(),
                (ParameterizedTypeReference<Object>) any(), (Object[]) any()))
                .thenReturn(new ResponseEntity<>(HttpStatus.CONTINUE));
        assertNull(oktaServiceImpl.saveAuthentication(new OktaUsers("janedoe", "iloveyou")));
        verify(restTemplate, atLeast(1)).exchange((String) any(), (HttpMethod) any(), (HttpEntity<Object>) any(),
                (ParameterizedTypeReference<Object>) any(), (Object[]) any());
    }

    /**
     * Method under test: {@link OktaServiceImpl#saveAuthentication(OktaUsers)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSaveAuthentication3() throws RestClientException {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "org.springframework.http.ResponseEntity.getBody()" because "responseEntity" is null
        //       at com.beyondid.service.OktaServiceImpl.saveAuthentication(OktaServiceImpl.java:386)
        //   See https://diff.blue/R013 to resolve this issue.

        when(restTemplate.exchange((String) any(), (HttpMethod) any(), (HttpEntity<Object>) any(),
                (ParameterizedTypeReference<Object>) any(), (Object[]) any())).thenReturn(null);
        oktaServiceImpl.saveAuthentication(new OktaUsers("janedoe", "iloveyou"));
    }

    /**
     * Method under test: {@link OktaServiceImpl#saveForgetPasswordWithSecurityAnswer(Credentials, OktaUsers)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSaveForgetPasswordWithSecurityAnswer() {
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

        OktaUsers oktaUsers = new OktaUsers("janedoe", "iloveyou");

        oktaServiceImpl.saveForgetPasswordWithSecurityAnswer(new Credentials(), oktaUsers);
    }

    /**
     * Method under test: {@link OktaServiceImpl#saveForgetPasswordWithSecurityAnswer(Credentials, OktaUsers)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSaveForgetPasswordWithSecurityAnswer2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.beyondid.data.Password.getValue()" because the return value of "com.beyondid.data.Credentials.getPassword()" is null
        //       at com.beyondid.service.OktaServiceImpl.saveForgetPasswordWithSecurityAnswer(OktaServiceImpl.java:413)
        //   See https://diff.blue/R013 to resolve this issue.

        Credentials credentials = new Credentials();
        oktaServiceImpl.saveForgetPasswordWithSecurityAnswer(credentials, new OktaUsers("janedoe", "iloveyou"));
    }

    /**
     * Method under test: {@link OktaServiceImpl#saveForgetPasswordWithSecurityAnswer(Credentials, OktaUsers)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSaveForgetPasswordWithSecurityAnswer3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.beyondid.data.recoveryQuestion.getAnswer()" because the return value of "com.beyondid.data.Credentials.getRecovery_question()" is null
        //       at com.beyondid.service.OktaServiceImpl.saveForgetPasswordWithSecurityAnswer(OktaServiceImpl.java:416)
        //   See https://diff.blue/R013 to resolve this issue.

        Credentials credentials = new Credentials();
        credentials.setPassword(new Password("42"));
        oktaServiceImpl.saveForgetPasswordWithSecurityAnswer(credentials, new OktaUsers("janedoe", "iloveyou"));
    }

    /**
     * Method under test: {@link OktaServiceImpl#saveForgetPasswordWithSecurityAnswer(Credentials, OktaUsers)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSaveForgetPasswordWithSecurityAnswer4() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.beyondid.data.recoveryQuestion.getAnswer()" because the return value of "com.beyondid.data.Credentials.getRecovery_question()" is null
        //       at com.beyondid.service.OktaServiceImpl.saveForgetPasswordWithSecurityAnswer(OktaServiceImpl.java:416)
        //   See https://diff.blue/R013 to resolve this issue.

        Credentials credentials = new Credentials();
        credentials.setPassword(new Password());
        oktaServiceImpl.saveForgetPasswordWithSecurityAnswer(credentials, new OktaUsers("janedoe", "iloveyou"));
    }

    /**
     * Method under test: {@link OktaServiceImpl#saveForgetPasswordWithSecurityAnswer(Credentials, OktaUsers)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSaveForgetPasswordWithSecurityAnswer5() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.beyondid.data.recoveryQuestion.getAnswer()" because the return value of "com.beyondid.data.Credentials.getRecovery_question()" is null
        //       at com.beyondid.service.OktaServiceImpl.saveForgetPasswordWithSecurityAnswer(OktaServiceImpl.java:416)
        //   See https://diff.blue/R013 to resolve this issue.

        Password password = mock(Password.class);
        when(password.getValue()).thenReturn("42");

        Credentials credentials = new Credentials();
        credentials.setPassword(password);
        oktaServiceImpl.saveForgetPasswordWithSecurityAnswer(credentials, new OktaUsers("janedoe", "iloveyou"));
    }

    /**
     * Method under test: {@link OktaServiceImpl#saveForgetPasswordWithSecurityAnswer(Credentials, OktaUsers)}
     */
    @Test
    void testSaveForgetPasswordWithSecurityAnswer6() throws RestClientException {
        when(restTemplate.exchange((String) any(), (HttpMethod) any(), (HttpEntity<Object>) any(),
                (ParameterizedTypeReference<Object>) any(), (Object[]) any()))
                .thenReturn(new ResponseEntity<>(HttpStatus.CONTINUE));
        Password password = mock(Password.class);
        when(password.getValue()).thenReturn("42");

        Credentials credentials = new Credentials();
        credentials.setRecovery_question(new recoveryQuestion());
        credentials.setPassword(password);
        assertNull(
                oktaServiceImpl.saveForgetPasswordWithSecurityAnswer(credentials, new OktaUsers("janedoe", "iloveyou")));
        verify(restTemplate).exchange((String) any(), (HttpMethod) any(), (HttpEntity<Object>) any(),
                (ParameterizedTypeReference<Object>) any(), (Object[]) any());
        verify(password).getValue();
    }

    /**
     * Method under test: {@link OktaServiceImpl#saveForgetPasswordWithSecurityAnswer(Credentials, OktaUsers)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSaveForgetPasswordWithSecurityAnswer7() throws RestClientException {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "org.springframework.http.ResponseEntity.getBody()" because "responseEntity" is null
        //       at com.beyondid.service.OktaServiceImpl.saveForgetPasswordWithSecurityAnswer(OktaServiceImpl.java:434)
        //   See https://diff.blue/R013 to resolve this issue.

        when(restTemplate.exchange((String) any(), (HttpMethod) any(), (HttpEntity<Object>) any(),
                (ParameterizedTypeReference<Object>) any(), (Object[]) any())).thenReturn(null);
        Password password = mock(Password.class);
        when(password.getValue()).thenReturn("42");

        Credentials credentials = new Credentials();
        credentials.setRecovery_question(new recoveryQuestion());
        credentials.setPassword(password);
        oktaServiceImpl.saveForgetPasswordWithSecurityAnswer(credentials, new OktaUsers("janedoe", "iloveyou"));
    }
}

