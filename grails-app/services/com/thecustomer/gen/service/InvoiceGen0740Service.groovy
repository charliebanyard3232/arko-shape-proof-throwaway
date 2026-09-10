// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class InvoiceGen0740Service {

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
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice0() { return 6708 }
    /** Derived accessor for region (generated filler). */
    def computeRegion1() { return 5964 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn2() { return 7154 }
    /** Derived accessor for category (generated filler). */
    def computeCategory3() { return 5496 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn4() { return 1184 }
    /** Derived accessor for active (generated filler). */
    def computeActive5() { return 7645 }
    /** Derived accessor for version (generated filler). */
    def computeVersion6() { return 816 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity7() { return 3378 }
    /** Derived accessor for active (generated filler). */
    def computeActive8() { return 2592 }
    /** Derived accessor for label (generated filler). */
    def computeLabel9() { return 6614 }
    /** Derived accessor for version (generated filler). */
    def computeVersion10() { return 4777 }
    /** Derived accessor for active (generated filler). */
}
