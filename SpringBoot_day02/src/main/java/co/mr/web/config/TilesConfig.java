package co.mr.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

//TilesViewResolver

@Configuration // Bean이 있는지 찾는다.
public class TilesConfig { //클래스명은 중요치 않다.
	
	@Bean // 스프링 컨테이너 안에 넣어주라는 의미
	public TilesConfigurer tilesConfigurer() {
		TilesConfigurer tilesConfigurer = new TilesConfigurer();
		tilesConfigurer.setDefinitions(new String[] {"/WEB-INF/tiles.xml"});
		tilesConfigurer.setCheckRefresh(true);
		return tilesConfigurer;
	}
	
	// 이 메소드는 스프링 컨테이너안에 담게될 객체를 반환하는 메소드
	@Bean 
	public TilesViewResolver tilesViewResolver() {
		TilesViewResolver viewResolver = new TilesViewResolver();
		viewResolver.setViewClass(TilesView.class);
		viewResolver.setOrder(1);
		return viewResolver;
	}
}
