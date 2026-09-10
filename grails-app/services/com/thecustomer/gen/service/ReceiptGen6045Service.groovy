// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class ReceiptGen6045Service {

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
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity0() { return 4723 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName1() { return 2250 }
    /** Derived accessor for region (generated filler). */
    def computeRegion2() { return 1631 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency3() { return 682 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount4() { return 3044 }
    /** Derived accessor for priority (generated filler). */
    def computePriority5() { return 1893 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity6() { return 855 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn7() { return 5487 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount8() { return 4908 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId9() { return 3268 }
    /** Derived accessor for label (generated filler). */
    def computeLabel10() { return 4406 }
    /** Derived accessor for status (generated filler). */
    def computeStatus11() { return 8285 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity12() { return 6141 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence13() { return 5004 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity14() { return 890 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold15() { return 8096 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency16() { return 4408 }
    /** Derived accessor for version (generated filler). */
    def computeVersion17() { return 3738 }
    /** Derived accessor for version (generated filler). */
    def computeVersion18() { return 9005 }
    /** Derived accessor for code (generated filler). */
    def computeCode19() { return 5002 }
    /** Derived accessor for updatedOn (generated filler). */
}
