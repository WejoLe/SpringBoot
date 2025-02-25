package MySecondTestAppSpringBoot.src.main.java.ru.shilov.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import ru.shilov.MySecondTestAppSpringBoot.exception.UnsupportedCodeException;
import ru.shilov.MySecondTestAppSpringBoot.exception.ValidationFailedException;
import ru.shilov.MySecondTestAppSpringBoot.model.Request;

@Service
public class RequstValidationService implements ValidationService{

    @Override
    public void isValid (BindingResult bindingResult) throws ValidationFailedException{
        if(bindingResult.hasErrors()){
            throw new
                    ValidationFailedException(bindingResult.getFieldError().toString());
        }
    }
    @Override
    public void uid123 (Request request) throws UnsupportedCodeException{
        String temp = request.getUid();
        if(request.getUid().equals("123")){
            throw new
                    UnsupportedCodeException("uid equals "+request.getUid());
        }
    }
}
