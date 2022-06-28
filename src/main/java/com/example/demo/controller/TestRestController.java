/**
 * <p class="copyright">Copyright 2022 by Gordon Food Service, Inc.</p>
 * 
 * <div class="vcard">
 *   <div class="fn org">Gordon Food Service, Inc.</div>
 *   <div class="adr">
 *     <div class="post-office-box">P.O. Box 1787</div>
 *     <div>
 *       <span class="locality">Grand Rapids</span>, 
 *       <abbr class="region" title="Michigan">MI</abbr> <span class="postal-code">49501</span>
 *     </div>
 *     <div class="country-name"><abbr title="United States of America">USA</abbr></div>
 *   </div>
 * </div>
 *
 * <p class="copyrightRights">All rights reserved.</p>
 * 
 * <p class="legal">
 * This software is the confidential and proprietary information of Gordon
 * Food Service, Inc. ("Confidential Information"). You shall not disclose
 * such Confidential Information and shall use it only in accordance with
 * the terms specified by Gordon Food Service.
 * </p>
 */
package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jagrawal
 */
@RestController
public class TestRestController {
    /**
     * @return
     */
    @GetMapping("/getMsg")
    public String getMessage() {
        return "Docker Test Successful";
    }

}
