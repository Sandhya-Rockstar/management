package com.example.management.model;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
@Component
public class EagerBean {

        public EagerBean() {
            System.out.println(" initiEagerBeanalized");
        }

    }
