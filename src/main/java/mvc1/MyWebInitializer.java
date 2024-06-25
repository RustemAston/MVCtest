package mvc1;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {SpringConfig.class};        // возвращаем название конфигурационного класса
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};      // эквивалентно тому, что все запросы пользователя посылаем на Dispatcher Servlet
    }
}