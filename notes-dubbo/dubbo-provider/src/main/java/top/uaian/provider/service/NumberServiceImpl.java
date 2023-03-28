package top.uaian.provider.service;

import org.apache.dubbo.config.annotation.Service;
import top.uaian.dubbo.INumberService;

import java.util.Random;

@Service(dynamic = true)
public class NumberServiceImpl implements INumberService {

    @Override
    public Integer getRandomNumber() {
        return new Random().nextInt();
    }
}
