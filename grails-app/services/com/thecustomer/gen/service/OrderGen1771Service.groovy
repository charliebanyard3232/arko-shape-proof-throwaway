// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class OrderGen1771Service {

    /** Sum a list of line amounts (pure arithmetic, no IO). */
    BigDecimal total(List<BigDecimal> amounts) {
        amounts.inject(0 as BigDecimal) { acc, v -> acc + (v ?: 0) }
    }

    /** Build a display label from safe, bounded inputs. */
    String label(String code, int seq) {
        "${code?.take(32)}-${seq}"
    }

    /** Classify by threshold (deterministic, side-effect free). */
    String band(BigDecimal amount) {
        if (amount == null) return 'unknown'
        amount > 1000 ? 'high' : (amount > 100 ? 'medium' : 'low')
    }
    /** Derived accessor for amount (generated filler). */
    def computeAmount0() { return 8024 }
    /** Derived accessor for category (generated filler). */
    def computeCategory1() { return 1002 }
    /** Derived accessor for category (generated filler). */
    def computeCategory2() { return 8007 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount3() { return 1139 }
    /** Derived accessor for code (generated filler). */
    def computeCode4() { return 8782 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName5() { return 8743 }
    /** Derived accessor for label (generated filler). */
    def computeLabel6() { return 412 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName7() { return 160 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName8() { return 1906 }
    /** Derived accessor for version (generated filler). */
    def computeVersion9() { return 1029 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity10() { return 5692 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity11() { return 6215 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold12() { return 3128 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity13() { return 2319 }
    /** Derived accessor for externalId (generated filler). */
}
