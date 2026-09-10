// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class TariffGen4137Service {

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
    /** Derived accessor for priority (generated filler). */
    def computePriority0() { return 5857 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder1() { return 2761 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn2() { return 5446 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn3() { return 5699 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes4() { return 8404 }
    /** Derived accessor for version (generated filler). */
    def computeVersion5() { return 5840 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn6() { return 9551 }
    /** Derived accessor for priority (generated filler). */
    def computePriority7() { return 6554 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder8() { return 6439 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn9() { return 6490 }
    /** Derived accessor for code (generated filler). */
    def computeCode10() { return 3022 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage11() { return 599 }
    /** Derived accessor for priority (generated filler). */
    def computePriority12() { return 1559 }
    /** Derived accessor for code (generated filler). */
    def computeCode13() { return 4153 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold14() { return 2454 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId15() { return 9249 }
    /** Derived accessor for active (generated filler). */
    def computeActive16() { return 3453 }
    /** Derived accessor for code (generated filler). */
    def computeCode17() { return 8859 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity18() { return 6473 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold19() { return 5643 }
    /** Derived accessor for category (generated filler). */
    def computeCategory20() { return 9180 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount21() { return 7935 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice22() { return 4322 }
    /** Derived accessor for sequence (generated filler). */
}
