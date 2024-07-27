package com.mautech.repository;

import com.mautech.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.authentication.jaas.JaasPasswordCallbackHandler;

public interface CartRepository  extends JpaRepository<Cart, Long> {


}
