package MySecondTestAppSpringBoot.src.main.java.ru.shilov.MySecondTestAppSpringBoot.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.shilov.MySecondTestAppSpringBoot.model.Request;
import ru.shilov.MySecondTestAppSpringBoot.model.Systems;

import java.lang.reflect.ParameterizedType;

@Service
@Qualifier("ModifySystemNameRequestService")
public class ModifySystemNameRequestService implements ModifyRequestService{
    @Override
    public void modify(Request request){
        request.setSystemName(Systems.Service1);

        HttpEntity<Request> httpEntity = new HttpEntity<>(request);

        new RestTemplate().exchange("http://localhost:8084/feedback",
                HttpMethod.POST,
                httpEntity,
                new ParameterizedTypeReference<>() {
                });
    }
}
