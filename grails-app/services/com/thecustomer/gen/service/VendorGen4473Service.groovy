// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class VendorGen4473Service {

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
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold0() { return 1280 }
    /** Derived accessor for description (generated filler). */
    def computeDescription1() { return 5323 }
    /** Derived accessor for label (generated filler). */
    def computeLabel2() { return 2828 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn3() { return 1693 }
    /** Derived accessor for reference (generated filler). */
    def computeReference4() { return 9367 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence5() { return 8326 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity6() { return 6470 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn7() { return 9050 }
    /** Derived accessor for status (generated filler). */
    def computeStatus8() { return 1723 }
    /** Derived accessor for reference (generated filler). */
    def computeReference9() { return 2363 }
    /** Derived accessor for status (generated filler). */
    def computeStatus10() { return 3189 }
    /** Derived accessor for category (generated filler). */
    def computeCategory11() { return 4958 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName12() { return 6948 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold13() { return 6360 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn14() { return 4262 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName15() { return 3561 }
    /** Derived accessor for status (generated filler). */
    def computeStatus16() { return 7138 }
    /** Derived accessor for reference (generated filler). */
    def computeReference17() { return 303 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold18() { return 6277 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn19() { return 2375 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity20() { return 5043 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice21() { return 2717 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold22() { return 3530 }
    /** Derived accessor for version (generated filler). */
    def computeVersion23() { return 70 }
}
