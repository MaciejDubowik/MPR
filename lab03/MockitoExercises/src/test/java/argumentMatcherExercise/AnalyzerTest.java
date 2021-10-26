package argumentMatcherExercise;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.startsWith;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class AnalyzerTest {
    @Mock
    Analyzer analyzer;

    @Test
    public void analyzerTest() {
        when(analyzer.analyze(anyString())).thenReturn(true);
        analyzer.analyze("blue");

        verify(analyzer).analyze(startsWith("b"));
    }
}
