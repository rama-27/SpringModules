package dev.rama27.app.testing.testbasics.mockito;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Map;
import static org.assertj.core.api.Assertions.assertThat;

import static org.assertj.core.api.BDDAssertions.and;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
@DisplayName("map")
public class ExampleMockito {
    @Mock
    private Map<String,String> mapMock;
    @Captor
    private ArgumentCaptor<String> stringArgCaptor;

    @Test
    public void listMap(){
        when(mapMock.get(stringArgCaptor.capture()))
                .thenReturn("springboot","testing");

        int size=mapMock.size();
        String secret1=mapMock.get("happiness");
        String secret2= mapMock.get("joy");

        verify(mapMock).size();
        verify(mapMock,times(2)).get(anyString());

        assertThat(stringArgCaptor.getAllValues().get(0)).isEqualTo("happiness");
        assertThat(stringArgCaptor.getAllValues().get(1)).isEqualTo("joy");

        assertThat(size).as("unexpected size").isEqualTo(0);
        assertThat(secret1).as("unexpected First Result").isEqualTo("springboot");
        assertThat(secret2).as("unexpected Second Result").isEqualTo("testing");
    }
    @Nested
    public class when_has_key{
        @Test public void return_value(){
            given(mapMock.get(stringArgCaptor.capture()))
                    .willReturn("springboot","testing");

            int size= mapMock.size();
            String secret1= mapMock.get("happiness");
            String secret2= mapMock.get("joy");

            then(mapMock).should().size();
            then(mapMock).should(times(2)).get(anyString());

            and.then(stringArgCaptor.getAllValues().get(0)).isEqualTo("happiness");
            and.then(stringArgCaptor.getAllValues().get(1)).isEqualTo("joy");
            and.then(size).as("unexpected size").isEqualTo(0);
            and.then(secret1).as("unexpected first result").isEqualTo("springboot");
            and.then(secret2).as("unexpected second result").isEqualTo("testing");
        }
    }
}
