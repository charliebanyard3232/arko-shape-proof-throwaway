// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class VendorGen2877Service {

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
    def computeQuantity0() { return 2806 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId1() { return 2358 }
    /** Derived accessor for active (generated filler). */
    def computeActive2() { return 8039 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency3() { return 2339 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId4() { return 588 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId5() { return 1242 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency6() { return 8094 }
    /** Derived accessor for version (generated filler). */
    def computeVersion7() { return 5073 }
    /** Derived accessor for reference (generated filler). */
    def computeReference8() { return 7812 }
    /** Derived accessor for active (generated filler). */
    def computeActive9() { return 9817 }
    /** Derived accessor for code (generated filler). */
    def computeCode10() { return 6301 }
    /** Derived accessor for priority (generated filler). */
    def computePriority11() { return 3852 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage12() { return 717 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency13() { return 1795 }
    /** Derived accessor for updatedOn (generated filler). */
}
