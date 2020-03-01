package cn.timebusker.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

  @Override
  public String addOrder(String name) {
    log.info("New order name： {}", name);
    return name + "O";
  }

}
